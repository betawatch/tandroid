// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m5b implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ wz5 b;
    public final /* synthetic */ c6b c;

    public m5b(c6b c6bVar, long j, wz5 wz5Var) {
        this.c = c6bVar;
        this.a = j;
        this.b = wz5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new z09(this, tLObject, this.a, this.b, (byte) 11));
    }
}
