package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ n4(long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, di.k1 k1Var) {
        this.c = j3;
        this.b = tL_starGiftUnique;
        this.d = context;
        this.e = i7;
        this.f = h6Var;
        this.g = str;
        this.h = k1Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        Runnable runnable = this.h;
        switch (i7) {
            case 0:
                di.k1 k1Var = (di.k1) runnable;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j3 = this.c;
                walletonchaingiftactionchangeprice.new_price = j3;
                p0Var.h = walletonchaingiftactionchangeprice;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.b;
                p0Var.i = tL_starGiftUnique;
                int i10 = this.e;
                Context context = this.d;
                org.telegram.ui.ActionBar.h6 h6Var = this.f;
                s3 s3Var = new s3(i10, context, tL_starGiftUnique, h6Var);
                String N0 = gd.N0(bool.booleanValue() ? 2131749528 : 2131749515, null);
                int i11 = bool.booleanValue() ? 2131749527 : 2131749529;
                String k10 = y4.k(j3);
                String str = this.g;
                s3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, i11, str, k10)), N0);
                String N02 = gd.N0(2131749534, null);
                SpannableStringBuilder l10 = y4.l(j3);
                ey0 ey0Var = s3Var.Z1;
                ey0Var.e(N02, l10, null, null);
                y4.c(s3Var, j3, y4.f(tL_starGiftUnique), h6Var);
                ey0Var.e(gd.N0(2131749539, null), y4.i(p0Var.b), null, null);
                y4.b(s3Var, tL_starGiftUnique);
                String N03 = gd.N0(bool.booleanValue() ? 2131749523 : 2131749526, null);
                m80 m80Var = s3Var.a2;
                m80Var.setText(N03);
                m80Var.setVisibility(TextUtils.isEmpty(N03) ? 8 : 0);
                s3Var.d2.i(gd.N0(2131749530, null), false, true);
                s3Var.q2 = 2131749614;
                s3Var.j1(p0Var);
                s3Var.i1(new p4(k1Var, tL_starGiftUnique, bool, str, i10, j3), new j(tL_starGiftUnique, bool, str, 2), new k4(context, i10, h6Var, s3Var, bool, 2));
                s3Var.show();
                break;
            default:
                di.k1 k1Var2 = (di.k1) runnable;
                org.telegram.ui.Wallet.p0 p0Var2 = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                cg.b bVar = cg.b.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.b;
                long j10 = tL_starGiftUnique2.getResellAmount(bVar).b;
                if (j10 > 0) {
                    walletonchaingiftactionchangeprice2.flags |= 1;
                    walletonchaingiftactionchangeprice2.old_price = j10;
                }
                long j11 = this.c;
                walletonchaingiftactionchangeprice2.new_price = j11;
                p0Var2.h = walletonchaingiftactionchangeprice2;
                p0Var2.i = tL_starGiftUnique2;
                int i12 = this.e;
                Context context2 = this.d;
                org.telegram.ui.ActionBar.h6 h6Var2 = this.f;
                s3 s3Var2 = new s3(i12, context2, tL_starGiftUnique2, h6Var2);
                String N04 = gd.N0(2131750247, null);
                String k11 = y4.k(j11);
                String str2 = this.g;
                s3Var2.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749651, str2, k11)), N04);
                String N05 = gd.N0(2131749534, null);
                SpannableStringBuilder l11 = y4.l(j11);
                ey0 ey0Var2 = s3Var2.Z1;
                ey0Var2.e(N05, l11, null, null);
                y4.c(s3Var2, j11, y4.f(tL_starGiftUnique2), h6Var2);
                ey0Var2.e(gd.N0(2131749539, null), y4.i(p0Var2.b), null, null);
                s3Var2.d2.i(gd.N0(2131750247, null), false, true);
                s3Var2.q2 = 2131749614;
                s3Var2.j1(p0Var2);
                s3Var2.i1(new e0(k1Var2, tL_starGiftUnique2, str2, i12, j11), new b4(tL_starGiftUnique2, str2, j11, 1), new k4(context2, i12, h6Var2, s3Var2, bool2, 3));
                s3Var2.show();
                break;
        }
    }

    public /* synthetic */ n4(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, di.k1 k1Var) {
        this.b = tL_starGiftUnique;
        this.c = j3;
        this.d = context;
        this.e = i7;
        this.f = h6Var;
        this.g = str;
        this.h = k1Var;
    }
}
