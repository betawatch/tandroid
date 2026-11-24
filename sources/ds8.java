// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ js8 b;

    public /* synthetic */ ds8(js8 js8Var, byte b) {
        this.a = b;
        this.b = js8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        js8 js8Var = this.b;
        switch (b) {
            case 0:
                if (!js8Var.T && !js8Var.S) {
                    tk0.c(js8Var.F, js8Var.h);
                    js8Var.G.d();
                    smc smcVar = js8Var.r;
                    ds8 ds8Var = new ds8(js8Var, (byte) 1);
                    mmc mmcVar = smcVar.E;
                    if (mmcVar == null) {
                        ds8Var.run();
                        break;
                    } else if (mmcVar.b == null) {
                        mmcVar.d = ds8Var;
                        break;
                    } else {
                        ds8Var.run();
                        break;
                    }
                }
                break;
            default:
                if (!js8Var.T && !js8Var.S) {
                    js8Var.a(1.0f);
                    break;
                }
                break;
        }
    }
}
