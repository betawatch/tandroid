package lg;

import org.telegram.messenger.k5;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ x0(b1 b1Var, int i3) {
        this.a = i3;
        this.b = b1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 1;
                final b1 b1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: lg.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        b1 b1Var2 = b1Var;
                        switch (i10) {
                            case 0:
                                b1Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        b1Var2.finishFragment();
                                        break;
                                    } else {
                                        k5.p(null, 2131743889, fc.a0(b1Var2), null);
                                        break;
                                    }
                                } else {
                                    fc.d0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        b1Var2.finishFragment();
                                        break;
                                    } else {
                                        b1Var2.b.b(false);
                                        k5.p(null, 2131743889, fc.a0(b1Var2), null);
                                        break;
                                    }
                                } else {
                                    b1Var2.b.b(false);
                                    fc.d0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final b1 b1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: lg.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        b1 b1Var22 = b1Var2;
                        switch (i102) {
                            case 0:
                                b1Var22.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        b1Var22.finishFragment();
                                        break;
                                    } else {
                                        k5.p(null, 2131743889, fc.a0(b1Var22), null);
                                        break;
                                    }
                                } else {
                                    fc.d0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        b1Var22.finishFragment();
                                        break;
                                    } else {
                                        b1Var22.b.b(false);
                                        k5.p(null, 2131743889, fc.a0(b1Var22), null);
                                        break;
                                    }
                                } else {
                                    b1Var22.b.b(false);
                                    fc.d0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
