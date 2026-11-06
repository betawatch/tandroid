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
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.tx0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k6 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.f6 g;
    public final org.telegram.ui.ActionBar.u1 h;
    public final b30 i;
    public final TextView j;
    public c k;
    public TextView l;
    public FrameLayout m;
    public vf.b n;
    public final HashMap o;
    public final HashSet p;
    public cg.b q;
    public fi.m3 r;

    public k6(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, h6 h6Var, int i7, long j3, String str, boolean z9, v10 v10Var) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j3;
        this.c = i7;
        cg.b bVar = h6Var.a;
        this.q = bVar;
        hashMap.put(bVar, h6Var);
        this.g = f6Var;
        this.e = str;
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        this.f = !z10;
        TLObject a22 = j3 >= 0 ? qp.s1(i7).a2(Long.valueOf(j3)) : qp.s1(i7).M0(Long.valueOf(-j3));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        j6 j6Var = new j6(this, context);
        j6Var.addView(f10, c8.ha.c(-2.0f, -1));
        if (z10) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, f6Var);
            jg.g.v(textView, 1, 14.0f, null, 2131750276);
            textView.setGravity(17);
            f10.addView(textView, c8.ha.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            b30 b30Var = new b30(context, f6Var);
            this.i = b30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(org.telegram.messenger.hd.M0(2131750278, null));
            arrayList.add(org.telegram.messenger.hd.M0(2131750277, null));
            b30Var.b(arrayList, new w0(this, 2));
            f10.addView(b30Var, c8.ha.t(-2, -2, 1, 18, 0, 18, 12));
        }
        f10.addView(new f6(context, tL_starGiftUnique, a22), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, f6Var);
        textView2.setTextSize(1, 16.0f);
        f10.addView(textView2, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
        if (z9) {
            tx0 tx0Var = new tx0(context, f6Var);
            k7.k1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            k7.k1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k7.k1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j10 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                tx0Var.c(org.telegram.messenger.hd.M0(2131749590, null), rf.b.i("~", org.telegram.messenger.r1.g(str2, h, j10, true)), null, null);
            }
            f10.addView(tx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        alertDialog$Builder.o(j6Var);
        alertDialog$Builder.k("_", new i6(this, i7, context, f6Var, v10Var, 0));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z9) {
        char c10;
        String a02;
        fi.m3 m3Var;
        cg.b bVar = this.q;
        h6 h6Var = (h6) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(h6Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(h6Var != null);
        this.l.setEnabled(h6Var != null);
        c cVar = this.k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        cg.b bVar2 = cg.b.b;
        b30 b30Var = this.i;
        if (b30Var != null) {
            b30Var.a(bVar == bVar2 ? 1 : 0, z9);
        }
        if (bVar == bVar2 && (m3Var = this.r) != null && m3Var.V) {
            m3Var.f(true);
        }
        c cVar2 = this.k;
        cg.b bVar3 = cg.b.a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ah.d(this, 9));
            } else {
                cVar2.setOnClickListener(new l1(19));
            }
        }
        vf.b bVar4 = this.n;
        if (bVar4 != null) {
            bVar4.a(false);
            this.n = null;
        }
        int i7 = this.c;
        long j3 = this.d;
        if (h6Var == null) {
            vf.b h = this.h.h(-1, false, false);
            this.n = h;
            h.d();
            if (this.p.add(bVar)) {
                ea.x(i7, bVar).H(this.a, j3, null, true, new ai.f1(5, this, bVar));
                return;
            }
            return;
        }
        cg.b bVar5 = h6Var.a;
        cg.a aVar = h6Var.c;
        boolean z10 = j3 == p10.i(i7).e();
        String str = this.e;
        if (bVar5 == bVar3) {
            c10 = 0;
            this.l.setText(dd.T0(org.telegram.messenger.hd.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(org.telegram.messenger.g0.X2(z10 ? org.telegram.messenger.hd.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str) : org.telegram.messenger.hd.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.m5.t(j3))));
        } else {
            c10 = 0;
        }
        if (bVar5 == bVar2) {
            TextView textView2 = this.l;
            Object[] objArr = new Object[1];
            objArr[c10] = aVar.d();
            textView2.setText(dd.V0(org.telegram.messenger.hd.a0(null, null, 2131750281, objArr), true));
            if (z10) {
                String d = aVar.d();
                Object[] objArr2 = new Object[2];
                objArr2[c10] = d;
                objArr2[1] = str;
                a02 = org.telegram.messenger.hd.a0(null, null, 2131750273, objArr2);
            } else {
                String d2 = aVar.d();
                String t6 = org.telegram.messenger.m5.t(j3);
                Object[] objArr3 = new Object[3];
                objArr3[c10] = d2;
                objArr3[1] = str;
                objArr3[2] = t6;
                a02 = org.telegram.messenger.hd.a0(null, null, 2131750269, objArr3);
            }
            textView.setText(org.telegram.messenger.g0.X2(a02));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.u1 u1Var = this.h;
        u1Var.X0 = true;
        u1Var.show();
        this.l = (TextView) u1Var.d(-1);
        this.k = u1Var.Z0;
        FrameLayout frameLayout = u1Var.Y0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            fi.m3 m3Var = new fi.m3(this.b, 3);
            m3Var.r(true);
            m3Var.K = Layout.Alignment.ALIGN_NORMAL;
            m3Var.d = 5000L;
            m3Var.u(org.telegram.messenger.hd.M0(2131750275, null));
            m3Var.w();
            this.r = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.m.addView(this.r, c8.ha.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
