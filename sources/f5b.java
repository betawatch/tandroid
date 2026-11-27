// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
