package kg;

import org.telegram.messenger.k5;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ w0(a1 a1Var, int i7) {
        this.a = i7;
        this.b = a1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final a1 a1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: kg.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        a1 a1Var2 = a1Var;
                        switch (i10) {
                            case 0:
                                a1Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        a1Var2.finishFragment();
                                        break;
                                    } else {
                                        k5.p(null, 2131743879, gc.a0(a1Var2), null);
                                        break;
                                    }
                                } else {
                                    gc.d0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        a1Var2.finishFragment();
                                        break;
                                    } else {
                                        a1Var2.b.b(false);
                                        k5.p(null, 2131743879, gc.a0(a1Var2), null);
                                        break;
                                    }
                                } else {
                                    a1Var2.b.b(false);
                                    gc.d0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final a1 a1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: kg.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        a1 a1Var22 = a1Var2;
                        switch (i102) {
                            case 0:
                                a1Var22.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        a1Var22.finishFragment();
                                        break;
                                    } else {
                                        k5.p(null, 2131743879, gc.a0(a1Var22), null);
                                        break;
                                    }
                                } else {
                                    gc.d0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        a1Var22.finishFragment();
                                        break;
                                    } else {
                                        a1Var22.b.b(false);
                                        k5.p(null, 2131743879, gc.a0(a1Var22), null);
                                        break;
                                    }
                                } else {
                                    a1Var22.b.b(false);
                                    gc.d0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
