package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements c20 {
    public final /* synthetic */ ea a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ c20 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ ij i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ k9(ea eaVar, long j3, boolean[] zArr, c20 c20Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, String str, ij ijVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.a = eaVar;
        this.b = j3;
        this.c = zArr;
        this.d = c20Var;
        this.e = context;
        this.f = f6Var;
        this.g = z9;
        this.h = str;
        this.i = ijVar;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i7;
        this.m = j10;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        c20 c20Var = (c20) obj;
        ea eaVar = this.a;
        long j3 = eaVar.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.c;
        c20 c20Var2 = this.d;
        ij ijVar = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i7 = this.l;
        if (j3 >= j10) {
            eaVar.Z(ijVar, inputInvoice, tL_payments_paymentFormStars, new z7(eaVar, i7, c20Var, zArr, c20Var2));
            return;
        }
        boolean z9 = qp.s1(eaVar.a).j7;
        Context context = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (!z9) {
            boolean[] zArr2 = {false};
            tc tcVar = new tc(context, f6Var, j10, this.g ? 9 : 0, this.h, new p9(eaVar, zArr2, ijVar, inputInvoice, tL_payments_paymentFormStars, zArr, i7, c20Var2, c20Var), this.m);
            tcVar.setOnDismissListener(new s7(eaVar, c20Var, zArr2, zArr, c20Var2, 1));
            tcVar.show();
            return;
        }
        if (c20Var != null) {
            c20Var.a(Boolean.FALSE);
        }
        if (!zArr[0] && c20Var2 != null) {
            c20Var2.a("cancelled");
            zArr[0] = true;
        }
        ea.c0(context, f6Var);
    }
}
