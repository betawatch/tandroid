// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class df6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ff6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ df6(ff6 ff6Var, String str, String str2, byte b) {
        this.a = b;
        this.b = ff6Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gm.c3(new af6(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                gm.c3(new af6(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
