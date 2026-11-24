// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ip6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ pg0 d;

    public /* synthetic */ ip6(pg0 pg0Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = pg0Var;
        this.b = z;
        this.c = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        pg0 pg0Var = this.d;
        switch (b) {
            case 0:
                gm.c3(new i71(pg0Var, (Object) tLObject, this.b, this.c, (byte) 4));
                break;
            default:
                gm.c3(new i71(pg0Var, (Object) tLObject, this.b, this.c, (byte) 6));
                break;
        }
    }
}
