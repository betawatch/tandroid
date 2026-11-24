// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw1 implements qac {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ lw1(nz1 nz1Var, Object obj, jo6 jo6Var, boolean z, int i, int i2, boolean z2, String str, Object obj2) {
        this.h = nz1Var;
        this.b = obj;
        this.i = jo6Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.g = str;
        this.j = obj2;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i = ChatActivityEnterView.z7;
                vw1 vw1Var = new vw1(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (g47) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.X1(vw1Var)) {
                    vw1Var.run();
                    break;
                }
                break;
            default:
                nz1 nz1Var = (nz1) obj3;
                vw1 vw1Var2 = new vw1(nz1Var, this.b, (jo6) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!nz1Var.a.X1(vw1Var2)) {
                    vw1Var2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lw1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, g47 g47Var, boolean z, int i, int i2, Object obj, boolean z2) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = g47Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.f = z2;
    }
}
