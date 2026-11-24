// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class hn6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ pf0 d;

    public /* synthetic */ hn6(pf0 pf0Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = pf0Var;
        this.b = z;
        this.c = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        pf0 pf0Var = this.d;
        switch (b) {
            case 0:
                gl.d3(new b61(pf0Var, (Object) tLObject, this.b, this.c, (byte) 4));
                break;
            default:
                gl.d3(new b61(pf0Var, (Object) tLObject, this.b, this.c, (byte) 6));
                break;
        }
    }
}
