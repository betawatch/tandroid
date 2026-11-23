package fi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
