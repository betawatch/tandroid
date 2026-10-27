package bi;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements Utilities.Callback {
    public final /* synthetic */ ca a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ r8(ca caVar, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.a = caVar;
        this.b = j10;
        this.c = zArr;
        this.d = callback;
        this.e = context;
        this.f = u6Var;
        this.g = z10;
        this.h = str;
        this.i = messageObject;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i10;
        this.m = j11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ca caVar = this.a;
        long j10 = caVar.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i10 = this.l;
        if (j10 >= j11) {
            caVar.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new z8(caVar, i10, callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(caVar.a).starsPurchaseAvailable();
        Context context = this.e;
        org.telegram.ui.ActionBar.u6 u6Var = this.f;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            tc tcVar = new tc(context, u6Var, j11, this.g ? 9 : 0, this.h, new y8(caVar, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.m);
            tcVar.setOnDismissListener(new s7(caVar, callback, zArr2, zArr, callback2, 1));
            tcVar.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback2 != null) {
            callback2.run("cancelled");
            zArr[0] = true;
        }
        ca.e0(context, u6Var);
    }
}
