package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ td(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        int i12 = this.b;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                zs.f(i12).k(zs.m2, Integer.valueOf(i11));
                break;
            case 1:
                ConnectionsManager.getInstance(i12).cancelRequest(i11, true);
                break;
            case 2:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i12, i11);
                break;
            case 3:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i12, i11);
                break;
            default:
                ConnectionsManager.getInstance(i12).cancelRequest(i11, true);
                break;
        }
    }
}
