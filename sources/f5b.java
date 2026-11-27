// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c6b b;

    public /* synthetic */ f5b(c6b c6bVar, byte b) {
        this.a = b;
        this.b = c6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c6b c6bVar = this.b;
        switch (b) {
            case 0:
                c6bVar.s = true;
                c6bVar.l.edit().putBoolean("read_loaded", true).apply();
                break;
            case 1:
            default:
                c6bVar.R = false;
                c6bVar.S = null;
                break;
        }
    }
}
