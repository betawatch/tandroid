package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ rd(int i3, int i10, int i11) {
        this.a = i11;
        this.b = i3;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.c;
        int i11 = this.b;
        switch (i3) {
            case 0:
                String[] strArr = MediaController.W1;
                hs.f(i11).k(hs.m2, Integer.valueOf(i10));
                break;
            case 1:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                break;
            case 2:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i11, i10);
                break;
            case 3:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i11, i10);
                break;
            default:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                break;
        }
    }
}
