package lh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements Utilities.Callback {
    public final /* synthetic */ t7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ k6(t7 t7Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.a = t7Var;
        this.b = j10;
        this.c = zArr;
        this.d = callback;
        this.e = context;
        this.f = f6Var;
        this.g = z4;
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
        t7 t7Var = this.a;
        long j10 = t7Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i10 = this.l;
        if (j10 >= j11) {
            t7Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new t6(t7Var, i10, callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(t7Var.a).starsPurchaseAvailable();
        Context context = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            z9 z9Var = new z9(context, f6Var, j11, this.g ? 9 : 0, this.h, new s6(t7Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.m);
            z9Var.setOnDismissListener(new p5(t7Var, callback, zArr2, zArr, callback2, 1));
            z9Var.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback2 != null) {
            callback2.run("cancelled");
            zArr[0] = true;
        }
        t7.e0(context, f6Var);
    }
}
