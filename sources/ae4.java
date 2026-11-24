// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ae4 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ me4 b;

    public /* synthetic */ ae4(me4 me4Var, byte b) {
        this.a = b;
        this.b = me4Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final me4 me4Var = this.b;
        switch (b) {
            case 0:
                me4Var.getClass();
                final byte b2 = 1;
                gm.c3(new Runnable() { // from class: yd4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        me4 me4Var2 = me4Var;
                        switch (b3) {
                            case 0:
                                me4Var2.F = 0;
                                if (tL_error2 == null) {
                                    ts2.u(null, 2131750679, c41.b0(me4Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                me4Var2.g0(tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gm.c3(new Runnable() { // from class: yd4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        me4 me4Var2 = me4Var;
                        switch (b32) {
                            case 0:
                                me4Var2.F = 0;
                                if (tL_error2 == null) {
                                    ts2.u(null, 2131750679, c41.b0(me4Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                me4Var2.g0(tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
