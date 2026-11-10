package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ s4(k7 k7Var, int i7) {
        this.a = i7;
        this.b = k7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final k7 k7Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                k7 k7Var2 = k7Var;
                                z1 z1Var = k7Var2.p3;
                                k7Var2.m3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.bc Y = k7Var2.k().Y(tL_error);
                                    Y.t = true;
                                    Y.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    qp.s1(k7Var2.a).Y3(paymentForm.users, false);
                                    k7Var2.n3 = paymentForm;
                                    org.telegram.messenger.g0.r(z1Var);
                                    org.telegram.messenger.g0.h3(z1Var);
                                    break;
                                }
                            default:
                                k7 k7Var3 = k7Var;
                                k7Var3.m3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.bc Y2 = k7Var3.k().Y(tL_error);
                                    Y2.t = true;
                                    Y2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    qp.s1(k7Var3.a).Y3(paymentForm2.users, false);
                                    k7Var3.n3 = paymentForm2;
                                    k7Var3.Z1();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final k7 k7Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k7 k7Var22 = k7Var2;
                                z1 z1Var = k7Var22.p3;
                                k7Var22.m3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.bc Y = k7Var22.k().Y(tL_error);
                                    Y.t = true;
                                    Y.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    qp.s1(k7Var22.a).Y3(paymentForm.users, false);
                                    k7Var22.n3 = paymentForm;
                                    org.telegram.messenger.g0.r(z1Var);
                                    org.telegram.messenger.g0.h3(z1Var);
                                    break;
                                }
                            default:
                                k7 k7Var3 = k7Var2;
                                k7Var3.m3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.bc Y2 = k7Var3.k().Y(tL_error);
                                    Y2.t = true;
                                    Y2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    qp.s1(k7Var3.a).Y3(paymentForm2.users, false);
                                    k7Var3.n3 = paymentForm2;
                                    k7Var3.Z1();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
