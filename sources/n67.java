// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n67 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t67 b;

    public /* synthetic */ n67(t67 t67Var, byte b) {
        this.a = b;
        this.b = t67Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final t67 t67Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gm.c3(new Runnable() { // from class: l67
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        t67 t67Var2 = t67Var;
                        switch (b3) {
                            case 0:
                                t67Var2.g0(tLObject2, tL_error2);
                                break;
                            case 1:
                                t67Var2.e0(tLObject2, tL_error2);
                                break;
                            default:
                                t67Var2.f0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 1;
                gm.c3(new Runnable() { // from class: l67
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        t67 t67Var2 = t67Var;
                        switch (b32) {
                            case 0:
                                t67Var2.g0(tLObject2, tL_error2);
                                break;
                            case 1:
                                t67Var2.e0(tLObject2, tL_error2);
                                break;
                            default:
                                t67Var2.f0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b4 = 2;
                gm.c3(new Runnable() { // from class: l67
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        t67 t67Var2 = t67Var;
                        switch (b32) {
                            case 0:
                                t67Var2.g0(tLObject2, tL_error2);
                                break;
                            case 1:
                                t67Var2.e0(tLObject2, tL_error2);
                                break;
                            default:
                                t67Var2.f0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
