package di;

import android.content.Context;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements x10 {
    public final /* synthetic */ y8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ x10 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ fj i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ f8(y8 y8Var, long j3, boolean[] zArr, x10 x10Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, String str, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.a = y8Var;
        this.b = j3;
        this.c = zArr;
        this.d = x10Var;
        this.e = context;
        this.f = h6Var;
        this.g = z10;
        this.h = str;
        this.i = fjVar;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i7;
        this.m = j10;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        x10 x10Var = (x10) obj;
        y8 y8Var = this.a;
        long j3 = y8Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.c;
        x10 x10Var2 = this.d;
        fj fjVar = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i7 = this.l;
        if (j3 >= j10) {
            y8Var.Y(fjVar, inputInvoice, tL_payments_paymentFormStars, new u6(y8Var, i7, x10Var, zArr, x10Var2));
            return;
        }
        boolean z10 = mp.u1(y8Var.a).m7;
        Context context = this.e;
        org.telegram.ui.ActionBar.h6 h6Var = this.f;
        if (!z10) {
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, h6Var, j10, this.g ? 9 : 0, this.h, new k8(y8Var, zArr2, fjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i7, x10Var2, x10Var), this.m);
            fbVar.setOnDismissListener(new n6(y8Var, x10Var, zArr2, zArr, x10Var2, 1));
            fbVar.show();
            return;
        }
        if (x10Var != null) {
            x10Var.a(Boolean.FALSE);
        }
        if (!zArr[0] && x10Var2 != null) {
            x10Var2.a("cancelled");
            zArr[0] = true;
        }
        y8.c0(context, h6Var);
    }
}
