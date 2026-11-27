// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mq1 implements df7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mq1(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // df7
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                zu1 zu1Var = ((oq1) obj).b;
                if (i > 0 && zu1Var.getParentActivity() != null) {
                    d31.b0(zu1Var).m(this.b ? c31.H : c31.J, i, 0, 0, zu1Var.Ba).j();
                    break;
                }
                break;
            default:
                nq1 nq1Var = (nq1) obj;
                zu1 zu1Var2 = nq1Var.b.b;
                if (i < 50) {
                    zu1Var2.Ia(zu1Var2.s4, true);
                    break;
                } else {
                    TLRPC.Chat chat = zu1Var2.e;
                    TLRPC.User user = zu1Var2.f;
                    boolean z = this.b;
                    jj.r(zu1Var2, true, chat, user, false, false, false, z, new rd1(nq1Var, z));
                    break;
                }
        }
    }
}
