// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                hl.c3(new ida(obj, (Object) document, (byte) 29));
                break;
        }
    }
}
