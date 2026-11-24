// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lr1 implements we7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lr1(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // we7
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                yv1 yv1Var = ((nr1) obj).b;
                if (i > 0 && yv1Var.getParentActivity() != null) {
                    c41.b0(yv1Var).m(this.b ? b41.H : b41.J, i, 0, 0, yv1Var.Ba).j();
                    break;
                }
                break;
            default:
                mr1 mr1Var = (mr1) obj;
                yv1 yv1Var2 = mr1Var.b.b;
                if (i < 50) {
                    yv1Var2.Ha(yv1Var2.s4, true);
                    break;
                } else {
                    TLRPC.Chat chat = yv1Var2.e;
                    TLRPC.User user = yv1Var2.f;
                    boolean z = this.b;
                    ik.r(yv1Var2, true, chat, user, false, false, false, z, new cd1(mr1Var, z));
                    break;
                }
        }
    }
}
