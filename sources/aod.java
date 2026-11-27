// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
