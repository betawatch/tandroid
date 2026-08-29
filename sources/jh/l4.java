package jh;

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
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.j40;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l4 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.c6 g;
    public final org.telegram.ui.ActionBar.c2 h;
    public final j40 i;
    public final TextView j;
    public b k;
    public TextView l;
    public FrameLayout m;
    public ye.c n;
    public final HashMap o;
    public final HashSet p;
    public kf.b q;
    public nh.t3 r;

    public l4(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, j4 j4Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i10;
        kf.b bVar = j4Var.a;
        this.q = bVar;
        hashMap.put(bVar, j4Var);
        this.g = c6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject user = j10 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        k4 k4Var = new k4(this, context);
        k4Var.addView(g10, i7.f6.c(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.y6, c6Var, textView, 1, 14.0f);
            org.telegram.ui.b.i(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            g10.addView(textView, i7.f6.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            j40 j40Var = new j40(context, c6Var);
            this.i = j40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            j40Var.b(arrayList, new j0(this, 2));
            g10.addView(j40Var, i7.f6.t(-2, -2, 1, 18, 0, 18, 12));
        }
        g10.addView(new i4(context, tL_starGiftUnique, user), i7.f6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.j5, c6Var, textView2, 1, 16.0f);
        g10.addView(textView2, i7.f6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            hz0 hz0Var = new hz0(context, c6Var);
            h5.q1(hz0Var, s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            h5.q1(hz0Var, s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h5.q1(hz0Var, s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                hz0Var.c(LocaleController.getString(R.string.GiftValue2), u3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            g10.addView(hz0Var, i7.f6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(k4Var);
        alertDialog$Builder.k("_", new bg.p3(this, i10, context, c6Var, callback2, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        nh.t3 t3Var;
        kf.b bVar = this.q;
        j4 j4Var = (j4) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(j4Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(j4Var != null);
        this.l.setEnabled(j4Var != null);
        b bVar2 = this.k;
        if (bVar2.e != bVar) {
            bVar2.e = bVar;
            bVar2.a();
        }
        kf.b bVar3 = kf.b.b;
        j40 j40Var = this.i;
        if (j40Var != null) {
            j40Var.a(bVar == bVar3 ? 1 : 0, z10);
        }
        if (bVar == bVar3 && (t3Var = this.r) != null && t3Var.R) {
            t3Var.e(true);
        }
        b bVar4 = this.k;
        kf.b bVar5 = kf.b.a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new ag.o(this, 20));
            } else {
                bVar4.setOnClickListener(new bg.n(24));
            }
        }
        ye.c cVar = this.n;
        if (cVar != null) {
            cVar.a(false);
            this.n = null;
        }
        int i10 = this.c;
        long j10 = this.d;
        if (j4Var == null) {
            ye.c g10 = this.h.g(-1, false, false);
            this.n = g10;
            g10.d();
            if (this.p.add(bVar)) {
                s7.x(i10, bVar).H(this.a, j10, null, true, new ih.b1(7, this, bVar));
                return;
            }
            return;
        }
        kf.b bVar6 = j4Var.a;
        kf.a aVar = j4Var.c;
        boolean z11 = j10 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.e;
        if (bVar6 == bVar5) {
            this.l.setText(ia.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10))));
        }
        if (bVar6 == bVar3) {
            this.l.setText(ia.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar.d(), str) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar.d(), str, DialogObject.getShortName(j10))));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.c2 c2Var = this.h;
        c2Var.T0 = true;
        c2Var.show();
        this.l = (TextView) c2Var.d(-1);
        this.k = c2Var.V0;
        FrameLayout frameLayout = c2Var.U0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            nh.t3 t3Var = new nh.t3(this.b, 3);
            t3Var.q(true);
            t3Var.G = Layout.Alignment.ALIGN_NORMAL;
            t3Var.d = 5000L;
            t3Var.t(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            t3Var.v();
            this.r = t3Var;
            t3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.m.addView(this.r, i7.f6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
