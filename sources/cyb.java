// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cyb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oyb b;

    public /* synthetic */ cyb(oyb oybVar, byte b) {
        this.a = b;
        this.b = oybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u46 u46Var;
        byte b = this.a;
        oyb oybVar = this.b;
        switch (b) {
            case 0:
                oybVar.P = null;
                oybVar.j();
                break;
            default:
                long j = oybVar.b;
                if (!oybVar.d && oybVar.y > 0.0f && (u46Var = (u46) oybVar.r.getLayoutManager()) != null && u46Var.M0() >= oybVar.s.c.size() - 3) {
                    if (!oybVar.i()) {
                        qwb qwbVar = oc7.r1(oybVar.a).g4;
                        long j2 = -j;
                        if (!qwbVar.e(j2)) {
                            qwbVar.o(j2);
                            break;
                        }
                    } else {
                        oybVar.j();
                        break;
                    }
                }
                break;
        }
    }
}
