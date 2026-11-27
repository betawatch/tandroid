// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class hca implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yt0 b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ hca(yt0 yt0Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = yt0Var;
        this.c = document;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.Document document = this.c;
        yt0 yt0Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                yt0Var.a(str, document);
                break;
            default:
                yt0Var.a(str, document);
                break;
        }
    }
}
