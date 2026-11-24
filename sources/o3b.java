// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h4b b;

    public /* synthetic */ o3b(h4b h4bVar, byte b) {
        this.a = b;
        this.b = h4bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        h4b h4bVar = this.b;
        switch (b) {
            case 0:
            default:
                h4bVar.R = false;
                h4bVar.S = null;
                break;
            case 1:
                h4bVar.s = true;
                h4bVar.l.edit().putBoolean("read_loaded", true).apply();
                break;
        }
    }
}
