// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
