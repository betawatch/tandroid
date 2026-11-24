// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bc6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc6 b;

    public /* synthetic */ bc6(oc6 oc6Var, byte b) {
        this.a = b;
        this.b = oc6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final oc6 oc6Var = this.b;
        switch (b) {
            case 0:
                oc6Var.getClass();
                final byte b2 = 1;
                gm.c3(new Runnable() { // from class: wb6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        oc6 oc6Var2 = oc6Var;
                        switch (b3) {
                            case 0:
                                oc6Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        oc6Var2.finishFragment();
                                        break;
                                    } else {
                                        mlb.y(null, 2131743566, c41.b0(oc6Var2), null);
                                        break;
                                    }
                                } else {
                                    c41.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        oc6Var2.finishFragment();
                                        break;
                                    } else {
                                        oc6Var2.b.b(false);
                                        mlb.y(null, 2131743566, c41.b0(oc6Var2), null);
                                        break;
                                    }
                                } else {
                                    oc6Var2.b.b(false);
                                    c41.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gm.c3(new Runnable() { // from class: wb6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        oc6 oc6Var2 = oc6Var;
                        switch (b32) {
                            case 0:
                                oc6Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        oc6Var2.finishFragment();
                                        break;
                                    } else {
                                        mlb.y(null, 2131743566, c41.b0(oc6Var2), null);
                                        break;
                                    }
                                } else {
                                    c41.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        oc6Var2.finishFragment();
                                        break;
                                    } else {
                                        oc6Var2.b.b(false);
                                        mlb.y(null, 2131743566, c41.b0(oc6Var2), null);
                                        break;
                                    }
                                } else {
                                    oc6Var2.b.b(false);
                                    c41.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
