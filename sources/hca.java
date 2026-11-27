// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
