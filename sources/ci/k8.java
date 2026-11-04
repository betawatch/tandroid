package ci;

import android.content.Context;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements u10 {
    public final /* synthetic */ e9 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ u10 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ zi i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ k8(e9 e9Var, long j10, boolean[] zArr, u10 u10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, zi ziVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i3, long j11) {
        this.a = e9Var;
        this.b = j10;
        this.c = zArr;
        this.d = u10Var;
        this.e = context;
        this.f = e6Var;
        this.g = z10;
        this.h = str;
        this.i = ziVar;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i3;
        this.m = j11;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        u10 u10Var = (u10) obj;
        e9 e9Var = this.a;
        long j10 = e9Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.c;
        u10 u10Var2 = this.d;
        zi ziVar = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i3 = this.l;
        if (j10 >= j11) {
            e9Var.Z(ziVar, inputInvoice, tL_payments_paymentFormStars, new a7(e9Var, i3, u10Var, zArr, u10Var2));
            return;
        }
        boolean z10 = hp.s1(e9Var.a).j7;
        Context context = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (!z10) {
            boolean[] zArr2 = {false};
            mb mbVar = new mb(context, e6Var, j11, this.g ? 9 : 0, this.h, new p8(e9Var, zArr2, ziVar, inputInvoice, tL_payments_paymentFormStars, zArr, i3, u10Var2, u10Var), this.m);
            mbVar.setOnDismissListener(new t6(e9Var, u10Var, zArr2, zArr, u10Var2, 1));
            mbVar.show();
            return;
        }
        if (u10Var != null) {
            u10Var.a(Boolean.FALSE);
        }
        if (!zArr[0] && u10Var2 != null) {
            u10Var2.a("cancelled");
            zArr[0] = true;
        }
        e9.c0(context, e6Var);
    }
}
