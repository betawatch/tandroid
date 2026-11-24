// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class inc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lnc b;

    public /* synthetic */ inc(lnc lncVar, byte b) {
        this.a = b;
        this.b = lncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lnc lncVar = this.b;
        switch (b) {
            case 0:
                lncVar.i();
                break;
            default:
                Runnable runnable = lncVar.d0;
                lncVar.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
