// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
