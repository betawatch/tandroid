// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mr1 implements ue7 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nr1 b;

    public mr1(nr1 nr1Var, boolean z) {
        this.b = nr1Var;
        this.a = z;
    }

    @Override // ue7
    public final void z(boolean z) {
        yv1 yv1Var = this.b.b;
        if (z) {
            TLRPC.User user = yv1Var.f;
            boolean z2 = this.a;
            if (user != null || z2) {
                cf7 messagesStorage = yv1Var.getMessagesStorage();
                messagesStorage.a.c(new fe7(messagesStorage, yv1Var.l6, new lr1((byte) 1, this, z2), (byte) 0));
                return;
            }
        }
        yv1Var.Ha(yv1Var.s4, z);
    }
}
