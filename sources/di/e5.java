package di;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.vx0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e5 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.e6 g;
    public final org.telegram.ui.ActionBar.t1 h;
    public final e30 i;
    public final TextView j;
    public b k;
    public TextView l;
    public FrameLayout m;
    public vf.b n;
    public final HashMap o;
    public final HashSet p;
    public cg.b q;
    public hi.l3 r;

    public e5(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, c5 c5Var, int i7, long j3, String str, boolean z10, s10 s10Var) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j3;
        this.c = i7;
        cg.b bVar = c5Var.a;
        this.q = bVar;
        hashMap.put(bVar, c5Var);
        this.g = e6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject a22 = j3 >= 0 ? np.s1(i7).a2(Long.valueOf(j3)) : np.s1(i7).M0(Long.valueOf(-j3));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        d5 d5Var = new d5(this, context);
        d5Var.addView(f10, c8.ja.c(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.y6, e6Var);
            i5.c.w(textView, 1, 14.0f, null, 2131750277);
            textView.setGravity(17);
            f10.addView(textView, c8.ja.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            e30 e30Var = new e30(context, e6Var);
            this.i = e30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(hd.M0(2131750279, null));
            arrayList.add(hd.M0(2131750278, null));
            e30Var.b(arrayList, new l0(this, 2));
            f10.addView(e30Var, c8.ja.t(-2, -2, 1, 18, 0, 18, 12));
        }
        f10.addView(new a5(context, tL_starGiftUnique, a22), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.j5, e6Var);
        textView2.setTextSize(1, 16.0f);
        f10.addView(textView2, c8.ja.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            vx0 vx0Var = new vx0(context, e6Var);
            c6.k1(vx0Var, u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            c6.k1(vx0Var, u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            c6.k1(vx0Var, u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j10 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                vx0Var.c(hd.M0(2131749591, null), r.b.k("~", org.telegram.messenger.r1.g(str2, h, j10, true)), null, null);
            }
            f10.addView(vx0Var, c8.ja.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.o(d5Var);
        alertDialog$Builder.k("_", new bi.b3(this, i7, context, e6Var, s10Var));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        char c10;
        String a02;
        hi.l3 l3Var;
        cg.b bVar = this.q;
        c5 c5Var = (c5) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(c5Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(c5Var != null);
        this.l.setEnabled(c5Var != null);
        b bVar2 = this.k;
        if (bVar2.e != bVar) {
            bVar2.e = bVar;
            bVar2.a();
        }
        cg.b bVar3 = cg.b.b;
        e30 e30Var = this.i;
        if (e30Var != null) {
            e30Var.a(bVar == bVar3 ? 1 : 0, z10);
        }
        if (bVar == bVar3 && (l3Var = this.r) != null && l3Var.W) {
            l3Var.f(true);
        }
        b bVar4 = this.k;
        cg.b bVar5 = cg.b.a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new ah.d(this, 16));
            } else {
                bVar4.setOnClickListener(new bi.o(22));
            }
        }
        vf.b bVar6 = this.n;
        if (bVar6 != null) {
            bVar6.a(false);
            this.n = null;
        }
        int i7 = this.c;
        long j3 = this.d;
        if (c5Var == null) {
            vf.b h = this.h.h(-1, false, false);
            this.n = h;
            h.d();
            if (this.p.add(bVar)) {
                u8.x(i7, bVar).H(this.a, j3, null, true, new ai.v1(10, this, bVar));
                return;
            }
            return;
        }
        cg.b bVar7 = c5Var.a;
        cg.a aVar = c5Var.c;
        boolean z11 = j3 == m10.i(i7).e();
        String str = this.e;
        if (bVar7 == bVar5) {
            c10 = 0;
            this.l.setText(lb.T0(hd.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(org.telegram.messenger.g0.X2(z11 ? hd.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str) : hd.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.m5.t(j3))));
        } else {
            c10 = 0;
        }
        if (bVar7 == bVar3) {
            TextView textView2 = this.l;
            Object[] objArr = new Object[1];
            objArr[c10] = aVar.d();
            textView2.setText(lb.V0(hd.a0(null, null, 2131750282, objArr), true));
            if (z11) {
                String d = aVar.d();
                Object[] objArr2 = new Object[2];
                objArr2[c10] = d;
                objArr2[1] = str;
                a02 = hd.a0(null, null, 2131750274, objArr2);
            } else {
                String d2 = aVar.d();
                String t6 = org.telegram.messenger.m5.t(j3);
                Object[] objArr3 = new Object[3];
                objArr3[c10] = d2;
                objArr3[1] = str;
                objArr3[2] = t6;
                a02 = hd.a0(null, null, 2131750270, objArr3);
            }
            textView.setText(org.telegram.messenger.g0.X2(a02));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.t1 t1Var = this.h;
        t1Var.Y0 = true;
        t1Var.show();
        this.l = (TextView) t1Var.d(-1);
        this.k = t1Var.a1;
        FrameLayout frameLayout = t1Var.Z0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            hi.l3 l3Var = new hi.l3(this.b, 3);
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_NORMAL;
            l3Var.d = 5000L;
            l3Var.u(hd.M0(2131750276, null));
            l3Var.w();
            this.r = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.m.addView(this.r, c8.ja.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
