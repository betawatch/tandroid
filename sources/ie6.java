// default package

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                        gl.c3(new kz5(qe6Var, tL_error, (byte) 22));
                        break;
                    }
                } else {
                    gl.c3(new sx5(qe6Var, this.c, tLObject, (byte) 23));
                    break;
                }
                break;
            default:
                gl.c3(new e45(this.b, tL_error, this.c, tLObject, (byte) 18));
                break;
        }
    }
}
