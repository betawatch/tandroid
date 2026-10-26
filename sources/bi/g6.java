package bi;

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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.w40;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class g6 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.u6 g;
    public final org.telegram.ui.ActionBar.e2 h;
    public final w40 i;
    public final TextView j;
    public c k;
    public TextView l;
    public FrameLayout m;
    public qf.c n;
    public final HashMap o;
    public final HashSet p;
    public bg.b q;
    public fi.v3 r;

    public g6(Context context, org.telegram.ui.ActionBar.u6 u6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, d6 d6Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i10;
        bg.b bVar = d6Var.a;
        this.q = bVar;
        hashMap.put(bVar, d6Var);
        this.g = u6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject user = j10 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        LinearLayout d = vh.d(context, 1);
        f6 f6Var = new f6(this, context);
        f6Var.addView(d, gb1.g(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.y6, u6Var);
            textView.setTextSize(1, 14.0f);
            vh.k(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            d.addView(textView, gb1.x(-2, -2, 17, 24, 4, 24, 4));
        } else {
            w40 w40Var = new w40(context, u6Var);
            this.i = w40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            w40Var.b(arrayList, new x0(this, 2));
            d.addView(w40Var, gb1.x(-2, -2, 1, 18, 0, 18, 12));
        }
        d.addView(new b6(context, tL_starGiftUnique, user), gb1.x(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.j5, u6Var);
        textView2.setTextSize(1, 16.0f);
        d.addView(textView2, gb1.x(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            w01 w01Var = new w01(context, u6Var);
            h7.H1(w01Var, ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            h7.H1(w01Var, ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h7.H1(w01Var, ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                w01Var.c(LocaleController.getString(R.string.GiftValue2), b10.j("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            d.addView(w01Var, gb1.x(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.o(f6Var);
        alertDialog$Builder.k("_", new e6(this, i10, context, u6Var, callback2, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        fi.v3 v3Var;
        bg.b bVar = this.q;
        d6 d6Var = (d6) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(d6Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(d6Var != null);
        this.l.setEnabled(d6Var != null);
        c cVar = this.k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        bg.b bVar2 = bg.b.b;
        w40 w40Var = this.i;
        if (w40Var != null) {
            w40Var.a(bVar == bVar2 ? 1 : 0, z10);
        }
        if (bVar == bVar2 && (v3Var = this.r) != null && v3Var.V) {
            v3Var.e(true);
        }
        c cVar2 = this.k;
        bg.b bVar3 = bg.b.a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ai.s(this, 9));
            } else {
                cVar2.setOnClickListener(new bh.f(22));
            }
        }
        qf.c cVar3 = this.n;
        if (cVar3 != null) {
            cVar3.a(false);
            this.n = null;
        }
        int i10 = this.c;
        long j10 = this.d;
        if (d6Var == null) {
            qf.c h = this.h.h(-1, false, false);
            this.n = h;
            h.d();
            if (this.p.add(bVar)) {
                ca.x(i10, bVar).H(this.a, j10, null, true, new ai.n1(5, this, bVar));
                return;
            }
            return;
        }
        bg.b bVar4 = d6Var.a;
        bg.a aVar = d6Var.c;
        boolean z11 = j10 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.e;
        if (bVar4 == bVar3) {
            this.l.setText(dd.P0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10))));
        }
        if (bVar4 == bVar2) {
            this.l.setText(dd.R0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar.d(), str) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar.d(), str, DialogObject.getShortName(j10))));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.e2 e2Var = this.h;
        e2Var.Z0 = true;
        e2Var.show();
        this.l = (TextView) e2Var.d(-1);
        this.k = e2Var.b1;
        FrameLayout frameLayout = e2Var.a1;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            fi.v3 v3Var = new fi.v3(this.b, 3);
            v3Var.p(true);
            v3Var.K = Layout.Alignment.ALIGN_NORMAL;
            v3Var.d = 5000L;
            v3Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            v3Var.u();
            this.r = v3Var;
            v3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.m.addView(this.r, gb1.h(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
