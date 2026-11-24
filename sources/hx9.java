// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hx9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ py b;

    public /* synthetic */ hx9(py pyVar, byte b) {
        this.a = b;
        this.b = pyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        py pyVar = this.b;
        switch (b) {
            case 0:
                gl.F3(((lw9) pyVar.f2).h);
                break;
            default:
                pyVar.requestFocus();
                break;
        }
    }
}
