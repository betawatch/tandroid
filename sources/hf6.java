// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hf6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ if6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ hf6(if6 if6Var, String str, String str2, byte b) {
        this.a = b;
        this.b = if6Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hl.c3(new ef6(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                hl.c3(new ef6(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
