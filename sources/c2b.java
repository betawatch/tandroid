// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f2b b;

    public /* synthetic */ c2b(f2b f2bVar, byte b) {
        this.a = b;
        this.b = f2bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f2b f2bVar = this.b;
        switch (b) {
            case 0:
                f2bVar.e();
                break;
            default:
                f2bVar.b();
                break;
        }
    }
}
