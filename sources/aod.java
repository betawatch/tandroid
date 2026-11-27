// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class aod implements Runnable {
    public final jtd a;
    public final prd b;

    public aod(jtd jtdVar, prd prdVar) {
        this.a = jtdVar;
        this.b = prdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            prd prdVar = this.b;
            if (rod.h.f(this.a, this, jtd.h(prdVar))) {
                jtd.j(this.a);
            }
        }
    }
}
