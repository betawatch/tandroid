// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class iw0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jw0 b;

    public /* synthetic */ iw0(jw0 jw0Var, byte b) {
        this.a = b;
        this.b = jw0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jw0 jw0Var = this.b;
        switch (b) {
            case 0:
                ow0 ow0Var = jw0Var.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    na7.q1(ow0Var.I).R3((TLRPC.TL_updates) tLObject, false);
                }
                gl.c3(new lv0(ow0Var, (byte) 16));
                break;
            default:
                gl.c3(new fv0(jw0Var, tLObject, tL_error, (byte) 1));
                break;
        }
    }
}
