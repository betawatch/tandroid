package di;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k2(f6 f6Var, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, y10 y10Var) {
        this.d = f6Var;
        this.e = tL_inputInvoiceStarGiftTransfer;
        this.b = j3;
        this.c = j10;
        this.f = y10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final f6 f6Var = (f6) this.d;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = (TLRPC.TL_inputInvoiceStarGiftTransfer) this.e;
                final y10 y10Var = (y10) this.f;
                final long j3 = this.b;
                final long j10 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.PaymentForm;
                        f6 f6Var2 = f6.this;
                        y10 y10Var2 = y10Var;
                        if (!z10) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            y10Var2.a(tL_error2);
                            org.telegram.ui.Components.gc Z = f6Var2.k().Z(tL_error2);
                            Z.t = true;
                            Z.j();
                            return;
                        }
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                        int i7 = 0;
                        np.u1(f6Var2.a).f4(paymentForm.users, false);
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
                        ConnectionsManager.getInstance(f6Var2.a).sendRequest(tL_payments_sendStarsForm, new h2(f6Var2, j3, j10, y10Var2, j11));
                    }
                });
                break;
            default:
                ((GroupCallMessagesController) this.d).lambda$sendCallMessage$6((org.telegram.messenger.voip.f) this.e, (GroupCallMessage) this.f, this.b, this.c, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ k2(GroupCallMessagesController groupCallMessagesController, org.telegram.messenger.voip.f fVar, GroupCallMessage groupCallMessage, long j3, long j10) {
        this.d = groupCallMessagesController;
        this.e = fVar;
        this.f = groupCallMessage;
        this.b = j3;
        this.c = j10;
    }
}
