// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mic implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ric b;
    public final /* synthetic */ int c;

    public /* synthetic */ mic(ric ricVar, int i, byte b) {
        this.a = b;
        this.b = ricVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ric ricVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new mic(ricVar, i, (byte) 2));
                break;
            case 1:
                gl.d3(new mic(ricVar, i, (byte) 3));
                break;
            case 2:
                ricVar.c(i);
                break;
            default:
                ricVar.a(i);
                break;
        }
    }
}
