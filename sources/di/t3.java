package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ t3(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final c6 c6Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                c6 c6Var2 = c6Var;
                                l1 l1Var = c6Var2.q3;
                                c6Var2.n3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.xb Y = c6Var2.k().Y(tL_error);
                                    Y.t = true;
                                    Y.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    np.s1(c6Var2.a).Y3(paymentForm.users, false);
                                    c6Var2.o3 = paymentForm;
                                    org.telegram.messenger.g0.r(l1Var);
                                    org.telegram.messenger.g0.h3(l1Var);
                                    break;
                                }
                            default:
                                c6 c6Var3 = c6Var;
                                c6Var3.n3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.xb Y2 = c6Var3.k().Y(tL_error);
                                    Y2.t = true;
                                    Y2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    np.s1(c6Var3.a).Y3(paymentForm2.users, false);
                                    c6Var3.o3 = paymentForm2;
                                    c6Var3.b2();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final c6 c6Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c6 c6Var22 = c6Var2;
                                l1 l1Var = c6Var22.q3;
                                c6Var22.n3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.xb Y = c6Var22.k().Y(tL_error);
                                    Y.t = true;
                                    Y.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    np.s1(c6Var22.a).Y3(paymentForm.users, false);
                                    c6Var22.o3 = paymentForm;
                                    org.telegram.messenger.g0.r(l1Var);
                                    org.telegram.messenger.g0.h3(l1Var);
                                    break;
                                }
                            default:
                                c6 c6Var3 = c6Var2;
                                c6Var3.n3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.xb Y2 = c6Var3.k().Y(tL_error);
                                    Y2.t = true;
                                    Y2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    np.s1(c6Var3.a).Y3(paymentForm2.users, false);
                                    c6Var3.o3 = paymentForm2;
                                    c6Var3.b2();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
