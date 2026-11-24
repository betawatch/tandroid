// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ed6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gd6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ed6(gd6 gd6Var, String str, String str2, byte b) {
        this.a = b;
        this.b = gd6Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gl.c3(new bd6(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                gl.c3(new bd6(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
