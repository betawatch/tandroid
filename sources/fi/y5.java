package fi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class y5 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ y10 b;
    public final /* synthetic */ p6 c;

    public y5(p6 p6Var, long j3, y10 y10Var) {
        this.c = p6Var;
        this.a = j3;
        this.b = y10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.j2(this, tLObject, this.a, this.b, 9));
    }
}
