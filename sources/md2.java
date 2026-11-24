// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class md2 implements pmb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x02 b;
    public final /* synthetic */ rg1 c;

    public /* synthetic */ md2(x02 x02Var, rg1 rg1Var, byte b) {
        this.a = b;
        this.b = x02Var;
        this.c = rg1Var;
    }

    @Override // pmb
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        rg1 rg1Var = this.c;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                x02Var.I();
                rg1Var.a(wallPaper);
                break;
            default:
                x02Var.I();
                rg1Var.a(wallPaper);
                break;
        }
    }
}
