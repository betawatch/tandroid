package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements p10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ q4(long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.c = j3;
        this.b = tL_starGiftUnique;
        this.d = context;
        this.e = i7;
        this.f = i6Var;
        this.g = str;
        this.h = k1Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        Runnable runnable = this.h;
        switch (i7) {
            case 0:
                di.k1 k1Var = (di.k1) runnable;
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j3 = this.c;
                walletonchaingiftactionchangeprice.new_price = j3;
                q0Var.h = walletonchaingiftactionchangeprice;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.b;
                q0Var.i = tL_starGiftUnique;
                int i10 = this.e;
                Context context = this.d;
                org.telegram.ui.ActionBar.i6 i6Var = this.f;
                u3 u3Var = new u3(i10, context, tL_starGiftUnique, i6Var);
                String N0 = gd.N0(bool.booleanValue() ? 2131749528 : 2131749515, null);
                int i11 = bool.booleanValue() ? 2131749527 : 2131749529;
                String k10 = a5.k(j3);
                String str = this.g;
                u3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, i11, str, k10)), N0);
                String N02 = gd.N0(2131749534, null);
                SpannableStringBuilder l10 = a5.l(j3);
                dy0 dy0Var = u3Var.Z1;
                dy0Var.e(N02, l10, null, null);
                a5.c(u3Var, j3, a5.f(tL_starGiftUnique), i6Var);
                dy0Var.e(gd.N0(2131749539, null), a5.i(q0Var.b), null, null);
                a5.b(u3Var, tL_starGiftUnique);
                String N03 = gd.N0(bool.booleanValue() ? 2131749523 : 2131749526, null);
                j80 j80Var = u3Var.a2;
                j80Var.setText(N03);
                j80Var.setVisibility(TextUtils.isEmpty(N03) ? 8 : 0);
                u3Var.d2.i(gd.N0(2131749530, null), false, true);
                u3Var.q2 = 2131749614;
                u3Var.j1(q0Var);
                u3Var.i1(new s4(k1Var, tL_starGiftUnique, bool, str, i10, j3), new j(tL_starGiftUnique, bool, str, 2), new n4(context, i10, i6Var, u3Var, bool, 2));
                u3Var.show();
                break;
            default:
                di.k1 k1Var2 = (di.k1) runnable;
                org.telegram.ui.Wallet.q0 q0Var2 = (org.telegram.ui.Wallet.q0) obj;
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
                q0Var2.h = walletonchaingiftactionchangeprice2;
                q0Var2.i = tL_starGiftUnique2;
                int i12 = this.e;
                Context context2 = this.d;
                org.telegram.ui.ActionBar.i6 i6Var2 = this.f;
                u3 u3Var2 = new u3(i12, context2, tL_starGiftUnique2, i6Var2);
                String N04 = gd.N0(2131750247, null);
                String k11 = a5.k(j11);
                String str2 = this.g;
                u3Var2.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749651, str2, k11)), N04);
                String N05 = gd.N0(2131749534, null);
                SpannableStringBuilder l11 = a5.l(j11);
                dy0 dy0Var2 = u3Var2.Z1;
                dy0Var2.e(N05, l11, null, null);
                a5.c(u3Var2, j11, a5.f(tL_starGiftUnique2), i6Var2);
                dy0Var2.e(gd.N0(2131749539, null), a5.i(q0Var2.b), null, null);
                u3Var2.d2.i(gd.N0(2131750247, null), false, true);
                u3Var2.q2 = 2131749614;
                u3Var2.j1(q0Var2);
                u3Var2.i1(new e0(k1Var2, tL_starGiftUnique2, str2, i12, j11), new d4(tL_starGiftUnique2, str2, j11, 1), new n4(context2, i12, i6Var2, u3Var2, bool2, 3));
                u3Var2.show();
                break;
        }
    }

    public /* synthetic */ q4(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.b = tL_starGiftUnique;
        this.c = j3;
        this.d = context;
        this.e = i7;
        this.f = i6Var;
        this.g = str;
        this.h = k1Var;
    }
}
