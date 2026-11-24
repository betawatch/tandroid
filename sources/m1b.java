// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g2b b;

    public /* synthetic */ m1b(g2b g2bVar, byte b) {
        this.a = b;
        this.b = g2bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g2b g2bVar = this.b;
        switch (b) {
            case 0:
            default:
                g2bVar.R = false;
                g2bVar.S = null;
                break;
            case 1:
                g2bVar.s = true;
                g2bVar.l.edit().putBoolean("read_loaded", true).apply();
                break;
        }
    }
}
