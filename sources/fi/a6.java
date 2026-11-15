package fi;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ z10 b;
    public final /* synthetic */ s6 c;

    public a6(s6 s6Var, long j3, z10 z10Var) {
        this.c = s6Var;
        this.a = j3;
        this.b = z10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new di.f2(this, tLObject, this.a, this.b, 10));
    }
}
