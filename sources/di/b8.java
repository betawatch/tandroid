package di;

import android.content.Context;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements z10 {
    public final /* synthetic */ u8 a;
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

    public /* synthetic */ b8(u8 u8Var, long j3, boolean[] zArr, z10 z10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i7, long j10) {
        this.a = u8Var;
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
        u8 u8Var = this.a;
        long j3 = u8Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.c;
        z10 z10Var2 = this.d;
        gj gjVar = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i7 = this.l;
        if (j3 >= j10) {
            u8Var.Z(gjVar, inputInvoice, tL_payments_paymentFormStars, new r6(u8Var, i7, z10Var, zArr, z10Var2));
            return;
        }
        boolean z10 = np.s1(u8Var.a).k7;
        Context context = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (!z10) {
            boolean[] zArr2 = {false};
            bb bbVar = new bb(context, e6Var, j10, this.g ? 9 : 0, this.h, new g8(u8Var, zArr2, gjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i7, z10Var2, z10Var), this.m);
            bbVar.setOnDismissListener(new k6(u8Var, z10Var, zArr2, zArr, z10Var2, 1));
            bbVar.show();
            return;
        }
        if (z10Var != null) {
            z10Var.a(Boolean.FALSE);
        }
        if (!zArr[0] && z10Var2 != null) {
            z10Var2.a("cancelled");
            zArr[0] = true;
        }
        u8.c0(context, e6Var);
    }
}
