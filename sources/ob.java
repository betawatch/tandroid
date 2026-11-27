// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ob implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cc b;

    public /* synthetic */ ob(cc ccVar, byte b) {
        this.a = b;
        this.b = ccVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        cc ccVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new ve2(ccVar, (TLRPC.UserFull) obj, (byte) 22));
                break;
            case 1:
                ccVar.b0.commission_permille = ((Integer) obj).intValue();
                ccVar.L0();
                break;
            default:
                ccVar.b0.duration_months = ((Integer) ccVar.d0.get(((Integer) obj).intValue())).intValue();
                ccVar.L0();
                break;
        }
    }
}
