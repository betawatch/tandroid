// default package

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ne4 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nf4 b;

    public /* synthetic */ ne4(nf4 nf4Var, byte b) {
        this.a = b;
        this.b = nf4Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        nf4 nf4Var = this.b;
        switch (b) {
            case 0:
                nf4Var.finishFragment();
                break;
            case 1:
            case 3:
                nf4Var.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            case 2:
            default:
                nf4Var.q0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
