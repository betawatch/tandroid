// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i4b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m4b b;

    public /* synthetic */ i4b(m4b m4bVar, byte b) {
        this.a = b;
        this.b = m4bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m4b m4bVar = this.b;
        switch (b) {
            case 0:
                m4bVar.b();
                break;
            case 1:
                gl.d3(new i4b(m4bVar, (byte) 0));
                break;
            case 2:
                m4bVar.dismiss();
                break;
            default:
                ae9 ae9Var = m4bVar.I;
                if (ae9Var != null) {
                    ae9Var.a(null);
                    m4bVar.I = null;
                }
                m4bVar.dismiss();
                break;
        }
    }
}
