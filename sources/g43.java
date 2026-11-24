// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class g43 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m43 b;

    public /* synthetic */ g43(m43 m43Var, byte b) {
        this.a = b;
        this.b = m43Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m43 m43Var = this.b;
        switch (b) {
            case 0:
                m43Var.a.invalidate();
                break;
            default:
                st stVar = m43Var.c;
                if (stVar.getParent() != null) {
                    if (m43Var.d) {
                        gl.B2(stVar);
                    } else {
                        try {
                            m43Var.b.removeView(stVar);
                        } catch (Exception unused) {
                        }
                    }
                    sr8 sr8Var = m43Var.p;
                    if (sr8Var != null) {
                        sr8Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
