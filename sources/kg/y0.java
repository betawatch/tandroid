package kg;

import org.telegram.messenger.f3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ y0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final c1 c1Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: kg.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        c1 c1Var2 = c1Var;
                        switch (i10) {
                            case 0:
                                c1Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        c1Var2.finishFragment();
                                        break;
                                    } else {
                                        f3.o(null, 2131743634, lc.b0(c1Var2), null);
                                        break;
                                    }
                                } else {
                                    lc.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        c1Var2.finishFragment();
                                        break;
                                    } else {
                                        c1Var2.b.b(false);
                                        f3.o(null, 2131743634, lc.b0(c1Var2), null);
                                        break;
                                    }
                                } else {
                                    c1Var2.b.b(false);
                                    lc.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final c1 c1Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: kg.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        c1 c1Var22 = c1Var2;
                        switch (i102) {
                            case 0:
                                c1Var22.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        c1Var22.finishFragment();
                                        break;
                                    } else {
                                        f3.o(null, 2131743634, lc.b0(c1Var22), null);
                                        break;
                                    }
                                } else {
                                    lc.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        c1Var22.finishFragment();
                                        break;
                                    } else {
                                        c1Var22.b.b(false);
                                        f3.o(null, 2131743634, lc.b0(c1Var22), null);
                                        break;
                                    }
                                } else {
                                    c1Var22.b.b(false);
                                    lc.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
