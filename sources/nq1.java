// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nq1 implements cf7 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ oq1 b;

    public nq1(oq1 oq1Var, boolean z) {
        this.b = oq1Var;
        this.a = z;
    }

    @Override // cf7
    public final void A(boolean z) {
        zu1 zu1Var = this.b.b;
        if (z) {
            TLRPC.User user = zu1Var.f;
            boolean z2 = this.a;
            if (user != null || z2) {
                kf7 messagesStorage = zu1Var.getMessagesStorage();
                messagesStorage.a.c(new le7(messagesStorage, zu1Var.l6, new mq1((byte) 1, this, z2), (byte) 0));
                return;
            }
        }
        zu1Var.Ia(zu1Var.s4, z);
    }
}
