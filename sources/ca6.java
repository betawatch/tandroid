// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ca6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pa6 b;

    public /* synthetic */ ca6(pa6 pa6Var, byte b) {
        this.a = b;
        this.b = pa6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final pa6 pa6Var = this.b;
        switch (b) {
            case 0:
                pa6Var.getClass();
                final byte b2 = 1;
                gl.c3(new Runnable() { // from class: x96
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pa6 pa6Var2 = pa6Var;
                        switch (b3) {
                            case 0:
                                pa6Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        pa6Var2.finishFragment();
                                        break;
                                    } else {
                                        yjb.x(null, 2131743640, u21.b0(pa6Var2), null);
                                        break;
                                    }
                                } else {
                                    u21.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        pa6Var2.finishFragment();
                                        break;
                                    } else {
                                        pa6Var2.b.b(false);
                                        yjb.x(null, 2131743640, u21.b0(pa6Var2), null);
                                        break;
                                    }
                                } else {
                                    pa6Var2.b.b(false);
                                    u21.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gl.c3(new Runnable() { // from class: x96
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pa6 pa6Var2 = pa6Var;
                        switch (b32) {
                            case 0:
                                pa6Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        pa6Var2.finishFragment();
                                        break;
                                    } else {
                                        yjb.x(null, 2131743640, u21.b0(pa6Var2), null);
                                        break;
                                    }
                                } else {
                                    u21.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        pa6Var2.finishFragment();
                                        break;
                                    } else {
                                        pa6Var2.b.b(false);
                                        yjb.x(null, 2131743640, u21.b0(pa6Var2), null);
                                        break;
                                    }
                                } else {
                                    pa6Var2.b.b(false);
                                    u21.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
