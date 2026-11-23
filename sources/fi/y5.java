package fi;

import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class y5 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ w10 b;
    public final /* synthetic */ p6 c;

    public y5(p6 p6Var, long j3, w10 w10Var) {
        this.c = p6Var;
        this.a = j3;
        this.b = w10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.j2(this, tLObject, this.a, this.b, 9));
    }
}
