package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z5 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ t60 b;
    public final /* synthetic */ s6 c;

    public z5(s6 s6Var, long j3, t60 t60Var) {
        this.c = s6Var;
        this.a = j3;
        this.b = t60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new di.f2(this, tLObject, this.a, this.b, 9));
    }
}
