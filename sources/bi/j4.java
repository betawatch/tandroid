package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ j4(long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.c = j3;
        this.b = tL_starGiftUnique;
        this.d = context;
        this.e = i7;
        this.f = i6Var;
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
                org.telegram.ui.ActionBar.i6 i6Var = this.f;
                o3 o3Var = new o3(i10, context, tL_starGiftUnique, i6Var);
                String M0 = gd.M0(bool.booleanValue() ? 2131749529 : 2131749516, null);
                int i11 = bool.booleanValue() ? 2131749528 : 2131749530;
                String k10 = u4.k(j3);
                String str = this.g;
                o3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, i11, str, k10)), M0);
                String M02 = gd.M0(2131749535, null);
                SpannableStringBuilder l10 = u4.l(j3);
                cy0 cy0Var = o3Var.Z1;
                cy0Var.e(M02, l10, null, null);
                u4.c(o3Var, j3, u4.f(tL_starGiftUnique), i6Var);
                cy0Var.e(gd.M0(2131749540, null), u4.i(p0Var.b), null, null);
                u4.b(o3Var, tL_starGiftUnique);
                String M03 = gd.M0(bool.booleanValue() ? 2131749524 : 2131749527, null);
                k80 k80Var = o3Var.a2;
                k80Var.setText(M03);
                k80Var.setVisibility(TextUtils.isEmpty(M03) ? 8 : 0);
                o3Var.d2.i(gd.M0(2131749531, null), false, true);
                o3Var.q2 = 2131749615;
                o3Var.j1(p0Var);
                o3Var.i1(new l4(k1Var, tL_starGiftUnique, bool, str, i10, j3), new j(tL_starGiftUnique, bool, str, 2), new g4(context, i10, i6Var, o3Var, bool, 2));
                o3Var.show();
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
                org.telegram.ui.ActionBar.i6 i6Var2 = this.f;
                o3 o3Var2 = new o3(i12, context2, tL_starGiftUnique2, i6Var2);
                String M04 = gd.M0(2131750248, null);
                String k11 = u4.k(j11);
                String str2 = this.g;
                o3Var2.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749652, str2, k11)), M04);
                String M05 = gd.M0(2131749535, null);
                SpannableStringBuilder l11 = u4.l(j11);
                cy0 cy0Var2 = o3Var2.Z1;
                cy0Var2.e(M05, l11, null, null);
                u4.c(o3Var2, j11, u4.f(tL_starGiftUnique2), i6Var2);
                cy0Var2.e(gd.M0(2131749540, null), u4.i(p0Var2.b), null, null);
                o3Var2.d2.i(gd.M0(2131750248, null), false, true);
                o3Var2.q2 = 2131749615;
                o3Var2.j1(p0Var2);
                o3Var2.i1(new e0(k1Var2, tL_starGiftUnique2, str2, i12, j11), new x3(tL_starGiftUnique2, str2, j11, 1), new g4(context2, i12, i6Var2, o3Var2, bool2, 3));
                o3Var2.show();
                break;
        }
    }

    public /* synthetic */ j4(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.b = tL_starGiftUnique;
        this.c = j3;
        this.d = context;
        this.e = i7;
        this.f = i6Var;
        this.g = str;
        this.h = k1Var;
    }
}
