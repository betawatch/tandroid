package di;

import android.content.Context;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements x10 {
    public final /* synthetic */ x8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ x10 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ fj i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ e8(x8 x8Var, long j3, boolean[] zArr, x10 x10Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, String str, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.a = x8Var;
        this.b = j3;
        this.c = zArr;
        this.d = x10Var;
        this.e = context;
        this.f = i6Var;
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
        x8 x8Var = this.a;
        long j3 = x8Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.c;
        x10 x10Var2 = this.d;
        fj fjVar = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i7 = this.l;
        if (j3 >= j10) {
            x8Var.Y(fjVar, inputInvoice, tL_payments_paymentFormStars, new u6(x8Var, i7, x10Var, zArr, x10Var2));
            return;
        }
        boolean z10 = mp.u1(x8Var.a).m7;
        Context context = this.e;
        org.telegram.ui.ActionBar.i6 i6Var = this.f;
        if (!z10) {
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, i6Var, j10, this.g ? 9 : 0, this.h, new j8(x8Var, zArr2, fjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i7, x10Var2, x10Var), this.m);
            fbVar.setOnDismissListener(new n6(x8Var, x10Var, zArr2, zArr, x10Var2, 1));
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
        x8.c0(context, i6Var);
    }
}
