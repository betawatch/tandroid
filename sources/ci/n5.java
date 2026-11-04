package ci;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n5 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.e6 g;
    public final org.telegram.ui.ActionBar.s1 h;
    public final x20 i;
    public final TextView j;
    public c k;
    public TextView l;
    public FrameLayout m;
    public sf.b n;
    public final HashMap o;
    public final HashSet p;
    public dg.b q;
    public gi.l3 r;

    public n5(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, l5 l5Var, int i3, long j10, String str, boolean z10, n10 n10Var) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i3;
        dg.b bVar = l5Var.a;
        this.q = bVar;
        hashMap.put(bVar, l5Var);
        this.g = e6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject a22 = j10 >= 0 ? hp.s1(i3).a2(Long.valueOf(j10)) : hp.s1(i3).M0(Long.valueOf(-j10));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        m5 m5Var = new m5(this, context);
        m5Var.addView(f10, mf.c(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, e6Var);
            k2.p1.u(textView, 1, 14.0f, null, 2131750285);
            textView.setGravity(17);
            f10.addView(textView, mf.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            x20 x20Var = new x20(context, e6Var);
            this.i = x20Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(bd.M0(2131750287, null));
            arrayList.add(bd.M0(2131750286, null));
            x20Var.b(arrayList, new p0(this, 2));
            f10.addView(x20Var, mf.t(-2, -2, 1, 18, 0, 18, 12));
        }
        f10.addView(new j5(context, tL_starGiftUnique, a22), mf.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, e6Var);
        textView2.setTextSize(1, 16.0f);
        f10.addView(textView2, mf.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            rx0 rx0Var = new rx0(context, e6Var);
            l6.k1(rx0Var, e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            l6.k1(rx0Var, e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            l6.k1(rx0Var, e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j11 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                rx0Var.c(bd.M0(2131749599, null), t4.c.f("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
            }
            f10.addView(rx0Var, mf.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.o(m5Var);
        alertDialog$Builder.k("_", new ai.m3(this, i3, context, e6Var, n10Var));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        char c2;
        String a02;
        gi.l3 l3Var;
        dg.b bVar = this.q;
        l5 l5Var = (l5) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(l5Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(l5Var != null);
        this.l.setEnabled(l5Var != null);
        c cVar = this.k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        dg.b bVar2 = dg.b.b;
        x20 x20Var = this.i;
        if (x20Var != null) {
            x20Var.a(bVar == bVar2 ? 1 : 0, z10);
        }
        if (bVar == bVar2 && (l3Var = this.r) != null && l3Var.W) {
            l3Var.f(true);
        }
        c cVar2 = this.k;
        dg.b bVar3 = dg.b.a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ai.b(this, 12));
            } else {
                cVar2.setOnClickListener(new ai.t(25));
            }
        }
        sf.b bVar4 = this.n;
        if (bVar4 != null) {
            bVar4.a(false);
            this.n = null;
        }
        int i3 = this.c;
        long j10 = this.d;
        if (l5Var == null) {
            sf.b h = this.h.h(-1, false, false);
            this.n = h;
            h.d();
            if (this.p.add(bVar)) {
                e9.x(i3, bVar).H(this.a, j10, null, true, new ai.o1(9, this, bVar));
                return;
            }
            return;
        }
        dg.b bVar5 = l5Var.a;
        dg.a aVar = l5Var.c;
        boolean z11 = j10 == h10.i(i3).e();
        String str = this.e;
        if (bVar5 == bVar3) {
            c2 = 0;
            this.l.setText(wb.T0(bd.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(org.telegram.messenger.g0.X2(z11 ? bd.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str) : bd.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.m5.t(j10))));
        } else {
            c2 = 0;
        }
        if (bVar5 == bVar2) {
            TextView textView2 = this.l;
            Object[] objArr = new Object[1];
            objArr[c2] = aVar.d();
            textView2.setText(wb.V0(bd.a0(null, null, 2131750290, objArr), true));
            if (z11) {
                String d = aVar.d();
                Object[] objArr2 = new Object[2];
                objArr2[c2] = d;
                objArr2[1] = str;
                a02 = bd.a0(null, null, 2131750282, objArr2);
            } else {
                String d10 = aVar.d();
                String t10 = org.telegram.messenger.m5.t(j10);
                Object[] objArr3 = new Object[3];
                objArr3[c2] = d10;
                objArr3[1] = str;
                objArr3[2] = t10;
                a02 = bd.a0(null, null, 2131750278, objArr3);
            }
            textView.setText(org.telegram.messenger.g0.X2(a02));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.s1 s1Var = this.h;
        s1Var.a1 = true;
        s1Var.show();
        this.l = (TextView) s1Var.d(-1);
        this.k = s1Var.c1;
        FrameLayout frameLayout = s1Var.b1;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            gi.l3 l3Var = new gi.l3(this.b, 3);
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_NORMAL;
            l3Var.d = 5000L;
            l3Var.u(bd.M0(2131750284, null));
            l3Var.w();
            this.r = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.m.addView(this.r, mf.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
