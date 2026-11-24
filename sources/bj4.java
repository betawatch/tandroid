// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bj4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ akb b;

    public /* synthetic */ bj4(akb akbVar, byte b) {
        this.a = b;
        this.b = akbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        akb akbVar = this.b;
        switch (b) {
            case 0:
                kk7.e().k(kk7.v4, akbVar, Boolean.TRUE, null, -1);
                break;
            default:
                akbVar.r();
                break;
        }
    }
}
