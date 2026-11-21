package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ w3(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final f6 f6Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                f6 f6Var2 = f6Var;
                                k1 k1Var = f6Var2.t3;
                                f6Var2.q3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.gc Z = f6Var2.k().Z(tL_error);
                                    Z.t = true;
                                    Z.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    mp.u1(f6Var2.a).f4(paymentForm.users, false);
                                    f6Var2.r3 = paymentForm;
                                    org.telegram.messenger.g0.r(k1Var);
                                    org.telegram.messenger.g0.g3(k1Var);
                                    break;
                                }
                            default:
                                f6 f6Var3 = f6Var;
                                f6Var3.q3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.gc Z2 = f6Var3.k().Z(tL_error);
                                    Z2.t = true;
                                    Z2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    mp.u1(f6Var3.a).f4(paymentForm2.users, false);
                                    f6Var3.r3 = paymentForm2;
                                    f6Var3.n2();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final f6 f6Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                f6 f6Var22 = f6Var2;
                                k1 k1Var = f6Var22.t3;
                                f6Var22.q3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.gc Z = f6Var22.k().Z(tL_error);
                                    Z.t = true;
                                    Z.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    mp.u1(f6Var22.a).f4(paymentForm.users, false);
                                    f6Var22.r3 = paymentForm;
                                    org.telegram.messenger.g0.r(k1Var);
                                    org.telegram.messenger.g0.g3(k1Var);
                                    break;
                                }
                            default:
                                f6 f6Var3 = f6Var2;
                                f6Var3.q3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.gc Z2 = f6Var3.k().Z(tL_error);
                                    Z2.t = true;
                                    Z2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    mp.u1(f6Var3.a).f4(paymentForm2.users, false);
                                    f6Var3.r3 = paymentForm2;
                                    f6Var3.n2();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
