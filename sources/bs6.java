// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class bs6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ rf0 d;

    public /* synthetic */ bs6(rf0 rf0Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = rf0Var;
        this.b = z;
        this.c = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        rf0 rf0Var = this.d;
        switch (b) {
            case 0:
                hl.c3(new j61(rf0Var, (Object) tLObject, this.b, this.c, (byte) 4));
                break;
            default:
                hl.c3(new j61(rf0Var, (Object) tLObject, this.b, this.c, (byte) 5));
                break;
        }
    }
}
