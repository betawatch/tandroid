package org.telegram.tgnet;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i10, int i11, int i12, boolean z10) {
        this.a = i12;
        this.c = i10;
        this.b = z10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.c, this.b, this.d);
                break;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.b, this.c, this.d);
                break;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.c, this.b, this.d);
                break;
        }
    }

    public /* synthetic */ b(boolean z10, int i10, int i11) {
        this.a = 1;
        this.b = z10;
        this.c = i10;
        this.d = i11;
    }
}
