package jh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements Utilities.Callback {
    public final /* synthetic */ s7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ k6(s7 s7Var, long j10, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.a = s7Var;
        this.b = j10;
        this.c = zArr;
        this.d = callback;
        this.e = context;
        this.f = c6Var;
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
        s7 s7Var = this.a;
        long j10 = s7Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i10 = this.l;
        if (j10 >= j11) {
            s7Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new s6(s7Var, i10, callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(s7Var.a).starsPurchaseAvailable();
        Context context = this.e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            y9 y9Var = new y9(context, c6Var, j11, this.g ? 9 : 0, this.h, new r6(s7Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.m);
            y9Var.setOnDismissListener(new p5(s7Var, callback, zArr2, zArr, callback2, 1));
            y9Var.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback2 != null) {
            callback2.run("cancelled");
            zArr[0] = true;
        }
        s7.e0(context, c6Var);
    }
}
