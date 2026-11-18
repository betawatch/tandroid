package fi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class x5 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ x10 b;
    public final /* synthetic */ p6 c;

    public x5(p6 p6Var, long j3, x10 x10Var) {
        this.c = p6Var;
        this.a = j3;
        this.b = x10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.i2(this, tLObject, this.a, this.b, 9));
    }
}
