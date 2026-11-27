// default package

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
