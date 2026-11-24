// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class af2 implements qob {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bf2 b;

    public /* synthetic */ af2(bf2 bf2Var, byte b) {
        this.a = b;
        this.b = bf2Var;
    }

    @Override // qob
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        bf2 bf2Var = this.b;
        switch (b) {
            case 0:
                if2 if2Var = bf2Var.a;
                if2Var.R1.H();
                if2Var.dismiss();
                break;
            default:
                if2 if2Var2 = bf2Var.a;
                if2Var2.R1.H();
                if2Var2.dismiss();
                break;
        }
    }
}
