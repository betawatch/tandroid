// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iuc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ muc b;

    public /* synthetic */ iuc(muc mucVar, byte b) {
        this.a = b;
        this.b = mucVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        m7 m7Var;
        byte b = this.a;
        muc mucVar = this.b;
        switch (b) {
            case 0:
                mucVar.e0((String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!mucVar.isFinished && (m7Var = mucVar.O) != null) {
                    if (user != null) {
                        hl.t1(m7Var);
                        mucVar.l0(null, user);
                        break;
                    } else {
                        hl.c3(new juc(mucVar, (byte) 1));
                        break;
                    }
                }
                break;
        }
    }
}
