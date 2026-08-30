package lh;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.sz0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k4 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.f6 g;
    public final org.telegram.ui.ActionBar.d2 h;
    public final n40 i;
    public final TextView j;
    public c k;
    public TextView l;
    public FrameLayout m;
    public af.f n;
    public final HashMap o;
    public final HashSet p;
    public mf.b q;
    public ph.f3 r;

    public k4(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, i4 i4Var, int i10, long j10, String str, boolean z4, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i10;
        mf.b bVar = i4Var.a;
        this.q = bVar;
        hashMap.put(bVar, i4Var);
        this.g = f6Var;
        this.e = str;
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        this.f = !z10;
        TLObject user = j10 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        j4 j4Var = new j4(this, context);
        j4Var.addView(f10, k7.b6.c(-2.0f, -1));
        if (z10) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.y6, f6Var, textView, 1, 14.0f);
            org.telegram.messenger.y3.r(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f10.addView(textView, k7.b6.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            n40 n40Var = new n40(context, f6Var);
            this.i = n40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            n40Var.b(arrayList, new j0(this, 2));
            f10.addView(n40Var, k7.b6.t(-2, -2, 1, 18, 0, 18, 12));
        }
        f10.addView(new h4(context, tL_starGiftUnique, user), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.j5, f6Var, textView2, 1, 16.0f);
        f10.addView(textView2, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z4) {
            sz0 sz0Var = new sz0(context, f6Var);
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                sz0Var.c(LocaleController.getString(R.string.GiftValue2), vh.v2.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f10.addView(sz0Var, k7.b6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(j4Var);
        alertDialog$Builder.k("_", new dg.l3(this, i10, context, f6Var, callback2, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z4) {
        ph.f3 f3Var;
        mf.b bVar = this.q;
        i4 i4Var = (i4) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(i4Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(i4Var != null);
        this.l.setEnabled(i4Var != null);
        c cVar = this.k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        mf.b bVar2 = mf.b.b;
        n40 n40Var = this.i;
        if (n40Var != null) {
            n40Var.a(bVar == bVar2 ? 1 : 0, z4);
        }
        if (bVar == bVar2 && (f3Var = this.r) != null && f3Var.S) {
            f3Var.e(true);
        }
        c cVar2 = this.k;
        mf.b bVar3 = mf.b.a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new androidx.mediarouter.app.c(this, 20));
            } else {
                cVar2.setOnClickListener(new dg.m(22));
            }
        }
        af.f fVar = this.n;
        if (fVar != null) {
            fVar.a(false);
            this.n = null;
        }
        int i10 = this.c;
        long j10 = this.d;
        if (i4Var == null) {
            af.f g10 = this.h.g(-1, false, false);
            this.n = g10;
            g10.d();
            if (this.p.add(bVar)) {
                t7.x(i10, bVar).H(this.a, j10, null, true, new kh.a1(7, this, bVar));
                return;
            }
            return;
        }
        mf.b bVar4 = i4Var.a;
        mf.a aVar = i4Var.c;
        boolean z10 = j10 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.e;
        if (bVar4 == bVar3) {
            this.l.setText(ja.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(AndroidUtilities.replaceTags(z10 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10))));
        }
        if (bVar4 == bVar2) {
            this.l.setText(ja.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
            textView.setText(AndroidUtilities.replaceTags(z10 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar.d(), str) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar.d(), str, DialogObject.getShortName(j10))));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        d2Var.U0 = true;
        d2Var.show();
        this.l = (TextView) d2Var.d(-1);
        this.k = d2Var.W0;
        FrameLayout frameLayout = d2Var.V0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            ph.f3 f3Var = new ph.f3(this.b, 3);
            f3Var.q(true);
            f3Var.H = Layout.Alignment.ALIGN_NORMAL;
            f3Var.d = 5000L;
            f3Var.t(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            f3Var.v();
            this.r = f3Var;
            f3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.m.addView(this.r, k7.b6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
