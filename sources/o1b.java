// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o1b implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ vx5 b;
    public final /* synthetic */ g2b c;

    public o1b(g2b g2bVar, long j, vx5 vx5Var) {
        this.c = g2bVar;
        this.a = j;
        this.b = vx5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.c3(new mx8(this, tLObject, this.a, this.b, (byte) 11));
    }
}
