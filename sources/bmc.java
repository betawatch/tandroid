// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bmc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cmc b;

    public /* synthetic */ bmc(cmc cmcVar, byte b) {
        this.a = b;
        this.b = cmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cmc cmcVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new bmc(cmcVar, (byte) 1));
                break;
            default:
                cmcVar.a();
                break;
        }
    }
}
