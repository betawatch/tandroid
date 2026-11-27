// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class gc6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tc6 b;

    public /* synthetic */ gc6(tc6 tc6Var, byte b) {
        this.a = b;
        this.b = tc6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final tc6 tc6Var = this.b;
        switch (b) {
            case 0:
                tc6Var.getClass();
                final byte b2 = 1;
                hl.c3(new Runnable() { // from class: ac6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        tc6 tc6Var2 = tc6Var;
                        switch (b3) {
                            case 0:
                                tc6Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        tc6Var2.finishFragment();
                                        break;
                                    } else {
                                        xnb.x(null, 2131743534, d31.b0(tc6Var2), null);
                                        break;
                                    }
                                } else {
                                    d31.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        tc6Var2.finishFragment();
                                        break;
                                    } else {
                                        tc6Var2.b.b(false);
                                        xnb.x(null, 2131743534, d31.b0(tc6Var2), null);
                                        break;
                                    }
                                } else {
                                    tc6Var2.b.b(false);
                                    d31.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                hl.c3(new Runnable() { // from class: ac6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        tc6 tc6Var2 = tc6Var;
                        switch (b32) {
                            case 0:
                                tc6Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        tc6Var2.finishFragment();
                                        break;
                                    } else {
                                        xnb.x(null, 2131743534, d31.b0(tc6Var2), null);
                                        break;
                                    }
                                } else {
                                    d31.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        tc6Var2.finishFragment();
                                        break;
                                    } else {
                                        tc6Var2.b.b(false);
                                        xnb.x(null, 2131743534, d31.b0(tc6Var2), null);
                                        break;
                                    }
                                } else {
                                    tc6Var2.b.b(false);
                                    d31.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
