package di;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ bi.g5[] c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;

    public /* synthetic */ y1(f6 f6Var, bi.g5[] g5VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.a = i7;
        this.b = f6Var;
        this.c = g5VarArr;
        this.d = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        Long l10 = (Long) obj;
        switch (this.a) {
            case 0:
                this.c[0].dismiss();
                f6 f6Var = this.b;
                Context context = f6Var.getContext();
                int i7 = f6Var.a;
                long longValue = l10.longValue();
                org.telegram.ui.ActionBar.i6 i6Var = f6Var.J0;
                hi.e eVar = f6Var.g2;
                Objects.requireNonNull(eVar);
                ai.d0 d0Var = new ai.d0(eVar, 3);
                org.telegram.ui.Components.kc k10 = f6Var.k();
                k1 k1Var = new k1(f6Var, 13);
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
                if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice.slug = tL_starGiftUnique.slug;
                    updatestargiftonchainprice.amount = longValue;
                    bi.a5.o(context, i7, updatestargiftonchainprice, tL_starGiftUnique.onchain_sale ? Boolean.valueOf(tL_starGiftUnique.fixed_sale) : null, i6Var, d0Var, k10, new bi.q4(longValue, tL_starGiftUnique, context, i7, i6Var, bi.a5.h(tL_starGiftUnique), k1Var));
                    break;
                }
                break;
            default:
                this.c[0].dismiss();
                f6 f6Var2 = this.b;
                Context context2 = f6Var2.getContext();
                int i10 = f6Var2.a;
                long longValue2 = l10.longValue();
                org.telegram.ui.ActionBar.i6 i6Var2 = f6Var2.J0;
                hi.e eVar2 = f6Var2.g2;
                Objects.requireNonNull(eVar2);
                ai.d0 d0Var2 = new ai.d0(eVar2, 3);
                org.telegram.ui.Components.kc k11 = f6Var2.k();
                k1 k1Var2 = new k1(f6Var2, 11);
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.d;
                if (!TextUtils.isEmpty(tL_starGiftUnique2.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice2 = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice2.slug = tL_starGiftUnique2.slug;
                    updatestargiftonchainprice2.amount = longValue2;
                    bi.a5.o(context2, i10, updatestargiftonchainprice2, Boolean.TRUE, i6Var2, d0Var2, k11, new bi.q4(tL_starGiftUnique2, longValue2, context2, i10, i6Var2, bi.a5.h(tL_starGiftUnique2), k1Var2));
                    break;
                }
                break;
        }
    }
}
