package bi;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x2(k7 k7Var, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, c20 c20Var) {
        this.d = k7Var;
        this.e = tL_inputInvoiceStarGiftTransfer;
        this.b = j3;
        this.c = j10;
        this.f = c20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final k7 k7Var = (k7) this.d;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = (TLRPC.TL_inputInvoiceStarGiftTransfer) this.e;
                final c20 c20Var = (c20) this.f;
                final long j3 = this.b;
                final long j10 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.g3
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z9 = tLObject2 instanceof TLRPC.PaymentForm;
                        k7 k7Var2 = k7.this;
                        c20 c20Var2 = c20Var;
                        if (!z9) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            c20Var2.a(tL_error2);
                            org.telegram.ui.Components.bc Y = k7Var2.k().Y(tL_error2);
                            Y.t = true;
                            Y.j();
                            return;
                        }
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                        int i7 = 0;
                        qp.s1(k7Var2.a).Y3(paymentForm.users, false);
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                        int size = arrayList.size();
                        long j11 = 0;
                        while (i7 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                            i7++;
                            j11 += tL_labeledPrice.amount;
                        }
                        ConnectionsManager.getInstance(k7Var2.a).sendRequest(tL_payments_sendStarsForm, new t2(k7Var2, j3, j10, c20Var2, j11));
                    }
                });
                break;
            default:
                ((GroupCallMessagesController) this.d).lambda$sendCallMessage$6((org.telegram.messenger.voip.f) this.e, (GroupCallMessage) this.f, this.b, this.c, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ x2(GroupCallMessagesController groupCallMessagesController, org.telegram.messenger.voip.f fVar, GroupCallMessage groupCallMessage, long j3, long j10) {
        this.d = groupCallMessagesController;
        this.e = fVar;
        this.f = groupCallMessage;
        this.b = j3;
        this.c = j10;
    }
}
