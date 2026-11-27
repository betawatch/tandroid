// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m57 b;

    public /* synthetic */ d57(m57 m57Var, byte b) {
        this.a = b;
        this.b = m57Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m57 m57Var = this.b;
        switch (b) {
            case 0:
                boolean z = m57Var.d0.d.r;
                gu guVar = m57Var.f;
                if (!z) {
                    guVar.z0(guVar.computeVerticalScrollRange() - (guVar.computeVerticalScrollExtent() + guVar.computeVerticalScrollOffset()), jn7.Y3, bb2.V);
                    break;
                } else {
                    guVar.z0(-guVar.computeVerticalScrollOffset(), jn7.Y3, bb2.V);
                    break;
                }
            default:
                m57Var.g(true, false);
                break;
        }
    }
}
