// default package

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ie6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qe6 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ ie6(qe6 qe6Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = qe6Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qe6 qe6Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        gl.d3(new kz5(qe6Var, tL_error, (byte) 22));
                        break;
                    }
                } else {
                    gl.d3(new sx5(qe6Var, this.c, tLObject, (byte) 23));
                    break;
                }
                break;
            default:
                gl.d3(new e45(this.b, tL_error, this.c, tLObject, (byte) 18));
                break;
        }
    }
}
