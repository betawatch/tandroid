package ai;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.u40;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class k6 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.d6 g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final u40 i;
    public final TextView j;
    public c k;
    public TextView l;
    public FrameLayout m;
    public pf.c n;
    public final HashMap o;
    public final HashSet p;
    public ag.c q;
    public ei.x3 r;

    public k6(Context context, org.telegram.ui.ActionBar.d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, h6 h6Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i10;
        ag.c cVar = h6Var.a;
        this.q = cVar;
        hashMap.put(cVar, h6Var);
        this.g = d6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject user = j10 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        LinearLayout e = wh.e(context, 1);
        j6 j6Var = new j6(this, context);
        j6Var.addView(e, w7.z5.d(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            wh.o(org.telegram.ui.ActionBar.h6.y6, d6Var, textView, 1, 14.0f);
            wh.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e.addView(textView, w7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            u40 u40Var = new u40(context, d6Var);
            this.i = u40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            u40Var.b(arrayList, new w0(this, 2));
            e.addView(u40Var, w7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        }
        e.addView(new f6(context, tL_starGiftUnique, user), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        wh.o(org.telegram.ui.ActionBar.h6.j5, d6Var, textView2, 1, 16.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            j01 j01Var = new j01(context, d6Var);
            k7.B1(j01Var, fa.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            k7.B1(j01Var, fa.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k7.B1(j01Var, fa.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                j01Var.c(LocaleController.getString(R.string.GiftValue2), r.c.g("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e.addView(j01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.n(j6Var);
        alertDialog$Builder.k("_", new i6(this, i10, context, d6Var, callback2, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        ei.x3 x3Var;
        ag.c cVar = this.q;
        h6 h6Var = (h6) this.o.get(cVar);
        TextView textView = this.j;
        textView.animate().alpha(h6Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(h6Var != null);
        this.l.setEnabled(h6Var != null);
        c cVar2 = this.k;
        if (cVar2.e != cVar) {
            cVar2.e = cVar;
            cVar2.a();
        }
        ag.c cVar3 = ag.c.b;
        u40 u40Var = this.i;
        if (u40Var != null) {
            u40Var.a(cVar == cVar3 ? 1 : 0, z10);
        }
        if (cVar == cVar3 && (x3Var = this.r) != null && x3Var.V) {
            x3Var.e(true);
        }
        c cVar4 = this.k;
        ag.c cVar5 = ag.c.a;
        if (cVar4 != null) {
            if (cVar == cVar5) {
                cVar4.setOnClickListener(new ah.g0(this, 7));
            } else {
                cVar4.setOnClickListener(new ah.f(22));
            }
        }
        pf.c cVar6 = this.n;
        if (cVar6 != null) {
            cVar6.a(false);
            this.n = null;
        }
        int i10 = this.c;
        long j10 = this.d;
        if (h6Var == null) {
            pf.c g10 = this.h.g(-1, false, false);
            this.n = g10;
            g10.d();
            if (this.p.add(cVar)) {
                fa.x(i10, cVar).H(this.a, j10, null, true, new n2(4, this, cVar));
                return;
            }
            return;
        }
        ag.c cVar7 = h6Var.a;
        ag.a aVar = h6Var.c;
        boolean z11 = j10 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.e;
        if (cVar7 == cVar5) {
            this.l.setText(ld.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10))));
        }
        if (cVar7 == cVar3) {
            this.l.setText(ld.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar.d(), str) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar.d(), str, DialogObject.getShortName(j10))));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.X0 = true;
        b2Var.show();
        this.l = (TextView) b2Var.d(-1);
        this.k = b2Var.Z0;
        FrameLayout frameLayout = b2Var.Y0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            ei.x3 x3Var = new ei.x3(this.b, 3);
            x3Var.p(true);
            x3Var.K = Layout.Alignment.ALIGN_NORMAL;
            x3Var.d = 5000L;
            x3Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            x3Var.u();
            this.r = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.m.addView(this.r, w7.z5.a(100.0f, 0.0f, 26.0f, 0.0f, 0.0f, -2, 48));
        }
        a(false);
    }
}
