// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nw1 implements pcc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ nw1(qy1 qy1Var, Object obj, no6 no6Var, boolean z, int i, int i2, boolean z2, String str, Object obj2) {
        this.h = qy1Var;
        this.b = obj;
        this.i = no6Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.g = str;
        this.j = obj2;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i = ChatActivityEnterView.X7;
                sv1 sv1Var = new sv1(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (n47) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.g2(sv1Var)) {
                    sv1Var.run();
                    break;
                }
                break;
            default:
                qy1 qy1Var = (qy1) obj3;
                sv1 sv1Var2 = new sv1(qy1Var, this.b, (no6) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!qy1Var.a.g2(sv1Var2)) {
                    sv1Var2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nw1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, n47 n47Var, boolean z, int i, int i2, Object obj, boolean z2) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = n47Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.f = z2;
    }
}
