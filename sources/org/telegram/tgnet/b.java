package org.telegram.tgnet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i7, int i10, int i11, boolean z10) {
        this.a = i11;
        this.c = i7;
        this.b = z10;
        this.d = i10;
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

    public /* synthetic */ b(boolean z10, int i7, int i10) {
        this.a = 1;
        this.b = z10;
        this.c = i7;
        this.d = i10;
    }
}
