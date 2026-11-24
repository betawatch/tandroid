// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i82 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p82 b;

    public /* synthetic */ i82(p82 p82Var, byte b) {
        this.a = b;
        this.b = p82Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        p82 p82Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new jn1(p82Var, tL_error, tLObject, (byte) 13));
                break;
            case 1:
                gl.d3(new k82(p82Var, (byte) 1));
                break;
            default:
                p82Var.getClass();
                gl.d3(new k82(p82Var, (byte) 4));
                break;
        }
    }
}
