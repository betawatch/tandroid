// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h47 implements tl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h47(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // tl
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hl.c3(new mn6(obj, (Object) document, (byte) 17));
                break;
            case 1:
                hl.c3(new ty8((dz8) obj, document));
                break;
            default:
                hl.c3(new n3b((q3b) obj, document, (byte) 0));
                break;
        }
    }
}
