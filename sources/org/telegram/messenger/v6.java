package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ v6(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController.lambda$startRecording$35(this.b, this.c);
                break;
            case 1:
                PasskeysController.lambda$login$11(this.b, this.c);
                break;
            case 2:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(this.b, this.c);
                break;
            case 3:
                ConnectionsManager.lambda$onConnectionStateChanged$15(this.b, this.c);
                break;
            default:
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                break;
        }
    }
}
