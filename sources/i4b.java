// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.c3(new i4b(m4bVar, (byte) 0));
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
