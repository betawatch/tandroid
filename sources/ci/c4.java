package ci;

import org.telegram.messenger.hp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ c4(l6 l6Var, int i3) {
        this.a = i3;
        this.b = l6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 1;
                final l6 l6Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                l6 l6Var2 = l6Var;
                                s1 s1Var = l6Var2.n3;
                                l6Var2.k3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.ac Y = l6Var2.k().Y(tL_error);
                                    Y.t = true;
                                    Y.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    hp.s1(l6Var2.a).Y3(paymentForm.users, false);
                                    l6Var2.l3 = paymentForm;
                                    org.telegram.messenger.g0.r(s1Var);
                                    org.telegram.messenger.g0.h3(s1Var);
                                    break;
                                }
                            default:
                                l6 l6Var3 = l6Var;
                                l6Var3.k3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.ac Y2 = l6Var3.k().Y(tL_error);
                                    Y2.t = true;
                                    Y2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    hp.s1(l6Var3.a).Y3(paymentForm2.users, false);
                                    l6Var3.l3 = paymentForm2;
                                    l6Var3.a2();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final l6 l6Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                l6 l6Var22 = l6Var2;
                                s1 s1Var = l6Var22.n3;
                                l6Var22.k3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.ac Y = l6Var22.k().Y(tL_error);
                                    Y.t = true;
                                    Y.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    hp.s1(l6Var22.a).Y3(paymentForm.users, false);
                                    l6Var22.l3 = paymentForm;
                                    org.telegram.messenger.g0.r(s1Var);
                                    org.telegram.messenger.g0.h3(s1Var);
                                    break;
                                }
                            default:
                                l6 l6Var3 = l6Var2;
                                l6Var3.k3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    org.telegram.ui.Components.ac Y2 = l6Var3.k().Y(tL_error);
                                    Y2.t = true;
                                    Y2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    hp.s1(l6Var3.a).Y3(paymentForm2.users, false);
                                    l6Var3.l3 = paymentForm2;
                                    l6Var3.a2();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
