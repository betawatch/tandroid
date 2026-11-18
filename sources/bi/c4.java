package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c4(long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.a = 1;
        this.b = j3;
        this.f = tL_starGiftUnique;
        this.c = context;
        this.d = i7;
        this.e = i6Var;
        this.g = str;
        this.h = k1Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj5;
                lc lcVar = (lc) obj4;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                long j3 = this.b;
                Context context = this.c;
                int i10 = this.d;
                org.telegram.ui.ActionBar.i6 i6Var = this.e;
                if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                    org.telegram.ui.Wallet.p0 o4 = f4.o(context, i6Var, lcVar, i10, tL_payments_starGiftOnchainOfferTx);
                    if (o4 != null) {
                        d4 d4Var = new d4(u1Var, context, i10, tL_messageActionStarGiftOnchainOffer, tL_payments_starGiftOnchainOfferTx, o4, i6Var, lcVar);
                        int i11 = o3.x2;
                        boolean[] zArr = new boolean[1];
                        aa.r rVar = new aa.r(zArr, new Runnable[]{org.telegram.ui.Wallet.u0.D(i10).l(o4, new h0(zArr, rVar, d4Var, 1))}, d4Var, 8);
                        org.telegram.messenger.g0.h3(rVar, 5000L);
                        break;
                    } else {
                        u1Var.dismiss();
                        f4.f(j3);
                        break;
                    }
                } else {
                    u1Var.dismiss();
                    f4.f(j3);
                    v4.r(context, i10, i6Var, lcVar, tL_error, null);
                    break;
                }
                break;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj5;
                String str = (String) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j10 = this.b;
                walletonchaingiftactionchangeprice.new_price = j10;
                p0Var.h = walletonchaingiftactionchangeprice;
                p0Var.i = tL_starGiftUnique;
                int i12 = this.d;
                Context context2 = this.c;
                org.telegram.ui.ActionBar.i6 i6Var2 = this.e;
                o3 o3Var = new o3(i12, context2, tL_starGiftUnique, i6Var2);
                o3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, bool.booleanValue() ? 2131749528 : 2131749530, str, v4.k(j10))), gd.M0(bool.booleanValue() ? 2131749529 : 2131749516, null));
                String M0 = gd.M0(2131749535, null);
                SpannableStringBuilder l10 = v4.l(j10);
                cy0 cy0Var = o3Var.Z1;
                cy0Var.e(M0, l10, null, null);
                v4.c(o3Var, j10, v4.f(tL_starGiftUnique), i6Var2);
                cy0Var.e(gd.M0(2131749540, null), v4.i(p0Var.b), null, null);
                v4.b(o3Var, tL_starGiftUnique);
                String M02 = gd.M0(bool.booleanValue() ? 2131749524 : 2131749527, null);
                k80 k80Var = o3Var.a2;
                k80Var.setText(M02);
                k80Var.setVisibility(TextUtils.isEmpty(M02) ? 8 : 0);
                o3Var.d2.i(gd.M0(2131749531, null), false, true);
                o3Var.q2 = 2131749615;
                o3Var.j1(p0Var);
                o3Var.i1(new l4(k1Var, tL_starGiftUnique, bool, str, i12, j10), new j(tL_starGiftUnique, bool, str, 2), new h4(context2, i12, i6Var2, o3Var, bool, 2));
                o3Var.show();
                break;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) obj5;
                String str2 = (String) obj4;
                di.k1 k1Var2 = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var2 = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j11 = tL_starGiftUnique2.getResellAmount(cg.b.b).b;
                if (j11 > 0) {
                    walletonchaingiftactionchangeprice2.flags |= 1;
                    walletonchaingiftactionchangeprice2.old_price = j11;
                }
                long j12 = this.b;
                walletonchaingiftactionchangeprice2.new_price = j12;
                p0Var2.h = walletonchaingiftactionchangeprice2;
                p0Var2.i = tL_starGiftUnique2;
                int i13 = this.d;
                Context context3 = this.c;
                org.telegram.ui.ActionBar.i6 i6Var3 = this.e;
                o3 o3Var2 = new o3(i13, context3, tL_starGiftUnique2, i6Var3);
                o3Var2.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749652, str2, v4.k(j12))), gd.M0(2131750248, null));
                String M03 = gd.M0(2131749535, null);
                SpannableStringBuilder l11 = v4.l(j12);
                cy0 cy0Var2 = o3Var2.Z1;
                cy0Var2.e(M03, l11, null, null);
                v4.c(o3Var2, j12, v4.f(tL_starGiftUnique2), i6Var3);
                cy0Var2.e(gd.M0(2131749540, null), v4.i(p0Var2.b), null, null);
                o3Var2.d2.i(gd.M0(2131750248, null), false, true);
                o3Var2.q2 = 2131749615;
                o3Var2.j1(p0Var2);
                o3Var2.i1(new e0(k1Var2, tL_starGiftUnique2, str2, i13, j12), new x3(tL_starGiftUnique2, str2, j12, 1), new h4(context3, i13, i6Var3, o3Var2, bool2, 3));
                o3Var2.show();
                break;
        }
    }

    public /* synthetic */ c4(Object obj, long j3, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = j3;
        this.c = context;
        this.d = i7;
        this.e = i6Var;
        this.g = obj2;
        this.h = obj3;
    }
}
