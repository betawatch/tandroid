package di;

import android.content.Context;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements z10 {
    public final /* synthetic */ v8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ z10 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ gj i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ c8(v8 v8Var, long j3, boolean[] zArr, z10 z10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.a = v8Var;
        this.b = j3;
        this.c = zArr;
        this.d = z10Var;
        this.e = context;
        this.f = e6Var;
        this.g = z10;
        this.h = str;
        this.i = gjVar;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i7;
        this.m = j10;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        z10 z10Var = (z10) obj;
        v8 v8Var = this.a;
        long j3 = v8Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.c;
        z10 z10Var2 = this.d;
        gj gjVar = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i7 = this.l;
        if (j3 >= j10) {
            v8Var.Z(gjVar, inputInvoice, tL_payments_paymentFormStars, new r6(v8Var, i7, z10Var, zArr, z10Var2));
            return;
        }
        boolean z10 = np.s1(v8Var.a).k7;
        Context context = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (!z10) {
            boolean[] zArr2 = {false};
            cb cbVar = new cb(context, e6Var, j10, this.g ? 9 : 0, this.h, new h8(v8Var, zArr2, gjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i7, z10Var2, z10Var), this.m);
            cbVar.setOnDismissListener(new k6(v8Var, z10Var, zArr2, zArr, z10Var2, 1));
            cbVar.show();
            return;
        }
        if (z10Var != null) {
            z10Var.a(Boolean.FALSE);
        }
        if (!zArr[0] && z10Var2 != null) {
            z10Var2.a("cancelled");
            zArr[0] = true;
        }
        v8.c0(context, e6Var);
    }
}
