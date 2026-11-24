// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kt1 implements uc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kt1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // uc7
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj;
                mu1 mu1Var = ((wt1) obj2).a;
                if (i > 0 && mu1Var.getParentActivity() != null && mu1Var.fragmentView != null) {
                    u21.b0(mu1Var).m(k27.J3(document) ? t21.H : t21.J, i, 0, 0, mu1Var.Ba).j();
                    break;
                }
                break;
            default:
                ((int[]) obj2)[0] = i;
                ((sb2) obj).run();
                break;
        }
    }
}
