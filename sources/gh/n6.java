package gh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n6 implements Utilities.Callback {
    public final /* synthetic */ v7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ n6(v7 v7Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i9, long j11) {
        this.a = v7Var;
        this.b = j10;
        this.c = zArr;
        this.d = callback;
        this.e = context;
        this.f = b6Var;
        this.g = z10;
        this.h = str;
        this.i = messageObject;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i9;
        this.m = j11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v7 v7Var = this.a;
        long j10 = v7Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i9 = this.l;
        if (j10 >= j11) {
            v7Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new v6(v7Var, i9, callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(v7Var.a).starsPurchaseAvailable();
        Context context = this.e;
        org.telegram.ui.ActionBar.b6 b6Var = this.f;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            ea eaVar = new ea(context, b6Var, j11, this.g ? 9 : 0, this.h, new u6(v7Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i9, callback2, callback), this.m);
            eaVar.setOnDismissListener(new s5(v7Var, callback, zArr2, zArr, callback2, 1));
            eaVar.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback2 != null) {
            callback2.run("cancelled");
            zArr[0] = true;
        }
        v7.e0(context, b6Var);
    }
}
