// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
