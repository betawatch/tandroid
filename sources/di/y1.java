package di;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ bi.d5[] c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;

    public /* synthetic */ y1(f6 f6Var, bi.d5[] d5VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.a = i7;
        this.b = f6Var;
        this.c = d5VarArr;
        this.d = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        Long l10 = (Long) obj;
        switch (this.a) {
            case 0:
                this.c[0].dismiss();
                f6 f6Var = this.b;
                Context context = f6Var.getContext();
                int i7 = f6Var.a;
                long longValue = l10.longValue();
                org.telegram.ui.ActionBar.h6 h6Var = f6Var.J0;
                hi.e eVar = f6Var.g2;
                Objects.requireNonNull(eVar);
                ai.h0 h0Var = new ai.h0(eVar, 3);
                org.telegram.ui.Components.lc k10 = f6Var.k();
                k1 k1Var = new k1(f6Var, 13);
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
                if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice.slug = tL_starGiftUnique.slug;
                    updatestargiftonchainprice.amount = longValue;
                    bi.x4.o(context, i7, updatestargiftonchainprice, tL_starGiftUnique.onchain_sale ? Boolean.valueOf(tL_starGiftUnique.fixed_sale) : null, h6Var, h0Var, k10, new bi.n4(longValue, tL_starGiftUnique, context, i7, h6Var, bi.x4.h(tL_starGiftUnique), k1Var));
                    break;
                }
                break;
            default:
                this.c[0].dismiss();
                f6 f6Var2 = this.b;
                Context context2 = f6Var2.getContext();
                int i10 = f6Var2.a;
                long longValue2 = l10.longValue();
                org.telegram.ui.ActionBar.h6 h6Var2 = f6Var2.J0;
                hi.e eVar2 = f6Var2.g2;
                Objects.requireNonNull(eVar2);
                ai.h0 h0Var2 = new ai.h0(eVar2, 3);
                org.telegram.ui.Components.lc k11 = f6Var2.k();
                k1 k1Var2 = new k1(f6Var2, 11);
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.d;
                if (!TextUtils.isEmpty(tL_starGiftUnique2.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice2 = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice2.slug = tL_starGiftUnique2.slug;
                    updatestargiftonchainprice2.amount = longValue2;
                    bi.x4.o(context2, i10, updatestargiftonchainprice2, Boolean.TRUE, h6Var2, h0Var2, k11, new bi.n4(tL_starGiftUnique2, longValue2, context2, i10, h6Var2, bi.x4.h(tL_starGiftUnique2), k1Var2));
                    break;
                }
                break;
        }
    }
}
