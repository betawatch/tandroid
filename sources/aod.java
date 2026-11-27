// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
