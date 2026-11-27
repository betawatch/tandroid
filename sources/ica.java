// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ica implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yt0 b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ ica(yt0 yt0Var, TLRPC.Document document, byte b) {
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
