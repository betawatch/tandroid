// default package

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bua {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final vnb g;
    public final id h;
    public final zh5 i;
    public final TextView j;
    public us0 k;
    public ie0 l;
    public TextView m;
    public FrameLayout n;
    public l01 o;
    public TLRPC.TL_textWithEntities p;
    public boolean q = true;
    public final HashMap r;
    public final HashSet s;
    public pj t;
    public kg5 u;

    public bua(Context context, vnb vnbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, zta ztaVar, int i, long j, String str, boolean z, icc iccVar) {
        HashMap hashMap = new HashMap();
        this.r = hashMap;
        this.s = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j;
        this.c = i;
        pj pjVar = ztaVar.a;
        this.t = pjVar;
        hashMap.put(pjVar, ztaVar);
        this.g = vnbVar;
        this.e = str;
        boolean z2 = tL_starGiftUnique.resale_ton_only;
        this.f = !z2;
        TLObject X1 = j >= 0 ? uc7.s1(i).X1(Long.valueOf(j)) : uc7.s1(i).M0(Long.valueOf(-j));
        LinearLayout j2 = uh9.j(context, 1);
        aua auaVar = new aua(this, context);
        auaVar.addView(j2, tre.c(-2.0f, -1));
        if (z2) {
            this.i = null;
            TextView textView = new TextView(context);
            yob.X(textView, aob.y6, vnbVar);
            bs2.r(14.0f, 1, 2131750236, textView, null);
            textView.setGravity(17);
            j2.addView(textView, tre.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            zh5 zh5Var = new zh5(context, vnbVar);
            this.i = zh5Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(ob6.M0(2131750238, null));
            arrayList.add(ob6.M0(2131750237, null));
            zh5Var.b(arrayList, new ze1(this, (byte) 6));
            j2.addView(zh5Var, tre.t(-2, -2, 1, 18, 0, 18, 12));
        }
        j2.addView(new xta(context, tL_starGiftUnique, X1), tre.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        yob.X(textView2, aob.j5, vnbVar);
        textView2.setTextSize(1, 16.0f);
        j2.addView(textView2, tre.t(-1, -2, 48, 24, 4, 24, 4));
        if (z) {
            hjb hjbVar = new hjb(context, vnbVar);
            wua.a1(hjbVar, jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            wua.a1(hjbVar, jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            wua.a1(hjbVar, jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                di0.h();
                hjbVar.f(ob6.M0(2131749362, null), c00.i("~", di0.f(tL_starGiftUnique.value_currency, di0.h().g(tL_starGiftUnique.value_currency), tL_starGiftUnique.value_amount, true)), null, null);
            }
            j2.addView(hjbVar, tre.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        alertDialog$Builder.n(auaVar);
        alertDialog$Builder.j("_", new eg(this, context, i, vnbVar, iccVar));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z) {
        kg5 kg5Var;
        pj pjVar = this.t;
        us0 us0Var = this.k;
        pj pjVar2 = pj.b;
        byte b = 1;
        boolean z2 = us0Var != null && pjVar == pjVar2;
        zta ztaVar = z2 ? null : (zta) this.r.get(pjVar);
        TextView textView = this.j;
        textView.animate().alpha((ztaVar != null || z2) ? 1.0f : 0.25f).start();
        textView.setEnabled(ztaVar != null || z2);
        this.m.setEnabled(ztaVar != null || z2);
        ie0 ie0Var = this.l;
        boolean z3 = this.k != null;
        if (ie0Var.n != z3) {
            ie0Var.n = z3;
            ie0Var.b();
        }
        ie0 ie0Var2 = this.l;
        if (ie0Var2.e != pjVar) {
            ie0Var2.e = pjVar;
            ie0Var2.b();
        }
        zh5 zh5Var = this.i;
        if (zh5Var != null) {
            zh5Var.a(pjVar == pjVar2 ? 1 : 0, z);
        }
        if (pjVar == pjVar2 && (kg5Var = this.u) != null && kg5Var.W) {
            kg5Var.f(true);
        }
        ie0 ie0Var3 = this.l;
        pj pjVar3 = pj.a;
        if (ie0Var3 != null) {
            if (pjVar == pjVar3) {
                ie0Var3.setOnClickListener(new kla(this, (byte) 4));
            } else {
                ie0Var3.setOnClickListener(new y00(b));
            }
        }
        l01 l01Var = this.o;
        if (l01Var != null) {
            l01Var.a(false);
            this.o = null;
        }
        int i = this.c;
        String str = this.e;
        long j = this.d;
        if (z2) {
            String d = this.a.getResellAmount(pjVar2).d();
            boolean z4 = j == yac.h(i).e();
            this.m.setText(nza.V0(ob6.a0(null, null, 2131750241, d), true));
            textView.setText(hl.S2(z4 ? ob6.a0(null, null, 2131750233, d, str) : ob6.a0(null, null, 2131750229, d, str, wf3.s(j))));
            return;
        }
        if (ztaVar == null) {
            l01 g = this.h.g(-1, false, false);
            this.o = g;
            g.d();
            if (this.s.add(pjVar)) {
                jxa.u(i, pjVar).E(this.a, this.d, this.p, this.q, new ku9(this, pjVar, (byte) 11));
                return;
            }
            return;
        }
        pj pjVar4 = ztaVar.a;
        oj ojVar = ztaVar.c;
        boolean z5 = j == yac.h(i).e();
        if (pjVar4 == pjVar3) {
            this.m.setText(nza.T0(ob6.H(',', "Gift2BuyDoPrice2", (int) ojVar.a())));
            textView.setText(hl.S2(z5 ? ob6.K("Gift2BuyPriceSelfText", (int) ojVar.a(), ',', str) : ob6.K("Gift2BuyPriceText", (int) ojVar.a(), ',', str, wf3.s(j))));
        }
        if (pjVar4 == pjVar2) {
            this.m.setText(nza.V0(ob6.a0(null, null, 2131750241, ojVar.d()), true));
            textView.setText(hl.S2(z5 ? ob6.a0(null, null, 2131750233, ojVar.d(), str) : ob6.a0(null, null, 2131750229, ojVar.d(), str, wf3.s(j))));
        }
    }

    public final void b() {
        id idVar = this.h;
        idVar.Y0 = true;
        idVar.show();
        this.m = (TextView) idVar.c(-1);
        this.l = idVar.a1;
        this.n = idVar.Z0;
        zh5 zh5Var = this.i;
        if (zh5Var != null && this.k == null) {
            zh5Var.setVisibility(8);
            this.t = pj.a;
        }
        if (this.n != null && this.f && this.k != null) {
            kg5 kg5Var = new kg5(this.b, 3);
            kg5Var.p(true);
            kg5Var.L = Layout.Alignment.ALIGN_NORMAL;
            kg5Var.d = 5000L;
            kg5Var.t(ob6.M0(2131750235, null));
            kg5Var.v();
            this.u = kg5Var;
            kg5Var.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
            this.n.addView(this.u, tre.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
