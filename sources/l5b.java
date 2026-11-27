// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l5b implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ wz5 b;
    public final /* synthetic */ c6b c;

    public l5b(c6b c6bVar, long j, wz5 wz5Var) {
        this.c = c6bVar;
        this.a = j;
        this.b = wz5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new y09(this, tLObject, this.a, this.b, (byte) 11));
    }
}
