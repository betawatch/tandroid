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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.u40;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class l6 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.g6 g;
    public final org.telegram.ui.ActionBar.c2 h;
    public final u40 i;
    public final TextView j;
    public c k;
    public TextView l;
    public FrameLayout m;
    public pf.c n;
    public final HashMap o;
    public final HashSet p;
    public ag.b q;
    public ei.x3 r;

    public l6(Context context, org.telegram.ui.ActionBar.g6 g6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, i6 i6Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i10;
        ag.b bVar = i6Var.a;
        this.q = bVar;
        hashMap.put(bVar, i6Var);
        this.g = g6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject user = j10 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        LinearLayout e = sl.e(context, 1);
        k6 k6Var = new k6(this, context);
        k6Var.addView(e, w7.z5.c(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.y6, g6Var);
            textView.setTextSize(1, 14.0f);
            sl.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e.addView(textView, w7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            u40 u40Var = new u40(context, g6Var);
            this.i = u40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            u40Var.b(arrayList, new w0(this, 2));
            e.addView(u40Var, w7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        }
        e.addView(new g6(context, tL_starGiftUnique, user), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.j5, g6Var);
        textView2.setTextSize(1, 16.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            o01 o01Var = new o01(context, g6Var);
            l7.H1(o01Var, ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            l7.H1(o01Var, ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            l7.H1(o01Var, ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                o01Var.c(LocaleController.getString(R.string.GiftValue2), si.o0.h("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e.addView(o01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.o(k6Var);
        alertDialog$Builder.k("_", new j6(this, i10, context, g6Var, callback2, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        ei.x3 x3Var;
        ag.b bVar = this.q;
        i6 i6Var = (i6) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(i6Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(i6Var != null);
        this.l.setEnabled(i6Var != null);
        c cVar = this.k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        ag.b bVar2 = ag.b.b;
        u40 u40Var = this.i;
        if (u40Var != null) {
            u40Var.a(bVar == bVar2 ? 1 : 0, z10);
        }
        if (bVar == bVar2 && (x3Var = this.r) != null && x3Var.V) {
            x3Var.e(true);
        }
        c cVar2 = this.k;
        ag.b bVar3 = ag.b.a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ah.g0(this, 7));
            } else {
                cVar2.setOnClickListener(new ah.f(22));
            }
        }
        pf.c cVar3 = this.n;
        if (cVar3 != null) {
            cVar3.a(false);
            this.n = null;
        }
        int i10 = this.c;
        long j10 = this.d;
        if (i6Var == null) {
            pf.c h = this.h.h(-1, false, false);
            this.n = h;
            h.d();
            if (this.p.add(bVar)) {
                ha.x(i10, bVar).H(this.a, j10, null, true, new o2(4, this, bVar));
                return;
            }
            return;
        }
        ag.b bVar4 = i6Var.a;
        ag.a aVar = i6Var.c;
        boolean z11 = j10 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.e;
        if (bVar4 == bVar3) {
            this.l.setText(nd.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10))));
        }
        if (bVar4 == bVar2) {
            this.l.setText(nd.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar.d(), str) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar.d(), str, DialogObject.getShortName(j10))));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.c2 c2Var = this.h;
        c2Var.Z0 = true;
        c2Var.show();
        this.l = (TextView) c2Var.d(-1);
        this.k = c2Var.b1;
        FrameLayout frameLayout = c2Var.a1;
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
            this.m.addView(this.r, w7.z5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
