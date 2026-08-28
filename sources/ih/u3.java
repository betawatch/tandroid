package ih;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ u3(b4 b4Var, int i9) {
        this.a = i9;
        this.b = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((d9) this.b.l.M1).g(false);
                break;
            case 1:
                i4 i4Var = this.b.l;
                c4 c4Var = i4Var.M1;
                if (c4Var != null) {
                    m9 m9Var = ((d9) c4Var).d;
                    m9Var.V0 = false;
                    m9Var.P();
                }
                i4Var.f1(false);
                i4Var.d3 = true;
                i4Var.G0.D(true);
                break;
            case 2:
                i4 i4Var2 = this.b.l;
                i4Var2.Q3 = true;
                i4Var2.setActive(false);
                break;
            default:
                i4 i4Var3 = this.b.l;
                i4Var3.Q3 = true;
                i4Var3.setActive(false);
                break;
        }
    }
}
