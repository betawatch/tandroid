package ag;

import org.telegram.messenger.m5;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ z1(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final f2 f2Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: ag.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        f2 f2Var2 = f2Var;
                        switch (i11) {
                            case 0:
                                f2Var2.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        f2Var2.finishFragment();
                                        break;
                                    } else {
                                        m5.o(null, 2131743904, cc.a0(f2Var2), null);
                                        break;
                                    }
                                } else {
                                    cc.d0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        f2Var2.finishFragment();
                                        break;
                                    } else {
                                        f2Var2.b.b(false);
                                        m5.o(null, 2131743904, cc.a0(f2Var2), null);
                                        break;
                                    }
                                } else {
                                    f2Var2.b.b(false);
                                    cc.d0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final f2 f2Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: ag.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        f2 f2Var22 = f2Var2;
                        switch (i112) {
                            case 0:
                                f2Var22.b.b(false);
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        f2Var22.finishFragment();
                                        break;
                                    } else {
                                        m5.o(null, 2131743904, cc.a0(f2Var22), null);
                                        break;
                                    }
                                } else {
                                    cc.d0(tL_error2);
                                    break;
                                }
                            default:
                                if (tL_error2 == null) {
                                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                                        f2Var22.finishFragment();
                                        break;
                                    } else {
                                        f2Var22.b.b(false);
                                        m5.o(null, 2131743904, cc.a0(f2Var22), null);
                                        break;
                                    }
                                } else {
                                    f2Var22.b.b(false);
                                    cc.d0(tL_error2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
