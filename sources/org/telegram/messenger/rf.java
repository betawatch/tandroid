package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class rf implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c1 d;

    public /* synthetic */ rf(c1 c1Var, boolean z10, long j3, int i7) {
        this.a = i7;
        this.d = c1Var;
        this.b = z10;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.g3(new pg((ri) this.d, tLObject, this.b, this.c, 1));
                break;
            default:
                g0.g3(new pg((mp) this.d, tLObject, this.b, this.c, 3));
                break;
        }
    }
}
