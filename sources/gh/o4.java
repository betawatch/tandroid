package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o4 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.b6 g;
    public final org.telegram.ui.ActionBar.c2 h;
    public final v30 i;
    public final TextView j;
    public b k;
    public TextView l;
    public FrameLayout m;
    public ve.d n;
    public final HashMap o;
    public final HashSet p;
    public gf.b q;
    public kh.x3 r;

    public o4(Context context, org.telegram.ui.ActionBar.b6 b6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, m4 m4Var, int i9, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i9;
        gf.b bVar = m4Var.a;
        this.q = bVar;
        hashMap.put(bVar, m4Var);
        this.g = b6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject user = j10 >= 0 ? MessagesController.getInstance(i9).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        LinearLayout f10 = ll.f(context, 1);
        n4 n4Var = new n4(this, context);
        n4Var.addView(f10, g7.e6.c(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            ll.n(org.telegram.ui.ActionBar.f6.y6, b6Var, textView, 1, 14.0f);
            ll.l(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f10.addView(textView, g7.e6.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            v30 v30Var = new v30(context, b6Var);
            this.i = v30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            v30Var.b(arrayList, new k0(this, 2));
            f10.addView(v30Var, g7.e6.t(-2, -2, 1, 18, 0, 18, 12));
        }
        f10.addView(new k4(context, tL_starGiftUnique, user), g7.e6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.j5, b6Var, textView2, 1, 16.0f);
        f10.addView(textView2, g7.e6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            wy0 wy0Var = new wy0(context, b6Var);
            k5.q1(wy0Var, v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            k5.q1(wy0Var, v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k5.q1(wy0Var, v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                wy0Var.c(LocaleController.getString(R.string.GiftValue2), ta.b.d("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f10.addView(wy0Var, g7.e6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.n(n4Var);
        alertDialog$Builder.k("_", new fh.z2(this, i9, context, b6Var, callback2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        kh.x3 x3Var;
        gf.b bVar = this.q;
        m4 m4Var = (m4) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(m4Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(m4Var != null);
        this.l.setEnabled(m4Var != null);
        b bVar2 = this.k;
        if (bVar2.e != bVar) {
            bVar2.e = bVar;
            bVar2.a();
        }
        gf.b bVar3 = gf.b.b;
        v30 v30Var = this.i;
        if (v30Var != null) {
            v30Var.a(bVar == bVar3 ? 1 : 0, z10);
        }
        if (bVar == bVar3 && (x3Var = this.r) != null && x3Var.R) {
            x3Var.e(true);
        }
        b bVar4 = this.k;
        gf.b bVar5 = gf.b.a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new androidx.mediarouter.app.c(this, 14));
            } else {
                bVar4.setOnClickListener(new fh.n(23));
            }
        }
        ve.d dVar = this.n;
        if (dVar != null) {
            dVar.a(false);
            this.n = null;
        }
        int i9 = this.c;
        long j10 = this.d;
        if (m4Var == null) {
            ve.d g10 = this.h.g(-1, false, false);
            this.n = g10;
            g10.d();
            if (this.p.add(bVar)) {
                v7.x(i9, bVar).H(this.a, j10, null, true, new fh.f1(7, this, bVar));
                return;
            }
            return;
        }
        gf.b bVar6 = m4Var.a;
        gf.a aVar = m4Var.c;
        boolean z11 = j10 == UserConfig.getInstance(i9).getClientUserId();
        String str = this.e;
        if (bVar6 == bVar5) {
            this.l.setText(oa.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10))));
        }
        if (bVar6 == bVar3) {
            this.l.setText(oa.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
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
            kh.x3 x3Var = new kh.x3(this.b, 3);
            x3Var.q(true);
            x3Var.G = Layout.Alignment.ALIGN_NORMAL;
            x3Var.d = 5000L;
            x3Var.t(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            x3Var.v();
            this.r = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.m.addView(this.r, g7.e6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
