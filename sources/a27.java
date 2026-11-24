// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a27 implements sl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a27(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // sl
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gl.c3(new oh6(obj, (Object) document, (byte) 20));
                break;
            case 1:
                gl.c3(new iv8((sv8) obj, document));
                break;
            default:
                gl.c3(new iya((rza) obj, document, (byte) 2));
                break;
        }
    }
}
