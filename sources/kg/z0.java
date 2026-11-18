package kg;

import org.telegram.messenger.f3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ z0(d1 d1Var, int i7) {
        this.a = i7;
        this.b = d1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final d1 d1Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: kg.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        d1 d1Var2 = d1Var;
                        switch (i10) {
                            case 0:
                                d1Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        d1Var2.finishFragment();
                                        break;
                                    } else {
                                        f3.o(null, 2131743642, lc.b0(d1Var2), null);
                                        break;
                                    }
                                } else {
                                    lc.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        d1Var2.finishFragment();
                                        break;
                                    } else {
                                        d1Var2.b.b(false);
                                        f3.o(null, 2131743642, lc.b0(d1Var2), null);
                                        break;
                                    }
                                } else {
                                    d1Var2.b.b(false);
                                    lc.e0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final d1 d1Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: kg.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        d1 d1Var22 = d1Var2;
                        switch (i102) {
                            case 0:
                                d1Var22.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        d1Var22.finishFragment();
                                        break;
                                    } else {
                                        f3.o(null, 2131743642, lc.b0(d1Var22), null);
                                        break;
                                    }
                                } else {
                                    lc.e0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        d1Var22.finishFragment();
                                        break;
                                    } else {
                                        d1Var22.b.b(false);
                                        f3.o(null, 2131743642, lc.b0(d1Var22), null);
                                        break;
                                    }
                                } else {
                                    d1Var22.b.b(false);
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
