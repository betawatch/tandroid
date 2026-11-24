// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ac4 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc4 b;

    public /* synthetic */ ac4(mc4 mc4Var, byte b) {
        this.a = b;
        this.b = mc4Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final mc4 mc4Var = this.b;
        switch (b) {
            case 0:
                mc4Var.getClass();
                final byte b2 = 1;
                gl.d3(new Runnable() { // from class: yb4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        mc4 mc4Var2 = mc4Var;
                        switch (b3) {
                            case 0:
                                mc4Var2.F = 0;
                                if (tL_error2 == null) {
                                    ir2.v(null, 2131750730, u21.b0(mc4Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                mc4Var2.f0(tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gl.d3(new Runnable() { // from class: yb4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        mc4 mc4Var2 = mc4Var;
                        switch (b32) {
                            case 0:
                                mc4Var2.F = 0;
                                if (tL_error2 == null) {
                                    ir2.v(null, 2131750730, u21.b0(mc4Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                mc4Var2.f0(tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
