// default package

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
