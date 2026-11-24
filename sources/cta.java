// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eta b;

    public /* synthetic */ cta(eta etaVar, byte b) {
        this.a = b;
        this.b = etaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        eta etaVar = this.b;
        switch (b) {
            case 0:
                etaVar.b();
                break;
            case 1:
                etaVar.a();
                break;
            default:
                m21 m21Var = etaVar.d;
                gta gtaVar = etaVar.q;
                cta ctaVar = etaVar.p;
                k27 k27Var = etaVar.b;
                if (!etaVar.l) {
                    etaVar.l = true;
                    k27Var.f((int) etaVar.k, etaVar.c(), true);
                    long j = gtaVar.g;
                    int i = gtaVar.a;
                    gtaVar.g = j + etaVar.k;
                    kk7.f(i).k(kk7.z3, new Object[0]);
                    etaVar.k = 0L;
                    kk7.f(i).k(kk7.n1, Long.valueOf(k27.B0(k27Var.k)), Integer.valueOf(k27Var.e1()), k27Var.k.reactions);
                }
                if (!etaVar.m) {
                    etaVar.m = true;
                    etaVar.f.b = 5000L;
                    gl.r(ctaVar);
                    gl.e3(ctaVar, 5000L);
                    m21Var.k(true);
                    m21Var.v = ctaVar;
                }
                etaVar.e.b.setText(etaVar.d());
                break;
        }
    }
}
