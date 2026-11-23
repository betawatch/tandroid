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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.m30;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h5 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.i6 g;
    public final org.telegram.ui.ActionBar.t1 h;
    public final m30 i;
    public final TextView j;
    public b k;
    public TextView l;
    public FrameLayout m;
    public vf.b n;
    public TLRPC.TL_textWithEntities o;
    public boolean p = true;
    public final HashMap q;
    public final HashSet r;
    public cg.b s;
    public hi.u3 t;

    public h5(Context context, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, f5 f5Var, int i7, long j3, String str, boolean z10, p10 p10Var) {
        HashMap hashMap = new HashMap();
        this.q = hashMap;
        this.r = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j3;
        this.c = i7;
        cg.b bVar = f5Var.a;
        this.s = bVar;
        hashMap.put(bVar, f5Var);
        this.g = i6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject c22 = j3 >= 0 ? mp.u1(i7).c2(Long.valueOf(j3)) : mp.u1(i7).O0(Long.valueOf(-j3));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g5 g5Var = new g5(this, context);
        g5Var.addView(g10, c8.na.c(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.y6, i6Var);
            i5.c.r(14.0f, 1, 2131750260, textView, null);
            textView.setGravity(17);
            g10.addView(textView, c8.na.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            m30 m30Var = new m30(context, i6Var);
            this.i = m30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(gd.N0(2131750262, null));
            arrayList.add(gd.N0(2131750261, null));
            m30Var.b(arrayList, new k0(this, 2));
            g10.addView(m30Var, c8.na.t(-2, -2, 1, 18, 0, 18, 12));
        }
        g10.addView(new d5(context, tL_starGiftUnique, c22), c8.na.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.j5, i6Var);
        textView2.setTextSize(1, 16.0f);
        g10.addView(textView2, c8.na.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            dy0 dy0Var = new dy0(context, i6Var);
            f6.m1(dy0Var, y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            f6.m1(dy0Var, y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            f6.m1(dy0Var, y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j10 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                dy0Var.e(gd.N0(2131749415, null), p5.c.k("~", org.telegram.messenger.r1.g(str2, h, j10, true)), null, null);
            }
            g10.addView(dy0Var, c8.na.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        alertDialog$Builder.o(g5Var);
        alertDialog$Builder.k("_", new bi.o5(this, i7, context, i6Var, p10Var));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        char c10;
        String a02;
        hi.u3 u3Var;
        cg.b bVar = this.s;
        f5 f5Var = (f5) this.q.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(f5Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(f5Var != null);
        this.l.setEnabled(f5Var != null);
        b bVar2 = this.k;
        if (bVar2.e != bVar) {
            bVar2.e = bVar;
            bVar2.b();
        }
        cg.b bVar3 = cg.b.b;
        m30 m30Var = this.i;
        if (m30Var != null) {
            m30Var.a(bVar == bVar3 ? 1 : 0, z10);
        }
        if (bVar == bVar3 && (u3Var = this.t) != null && u3Var.W) {
            u3Var.f(true);
        }
        b bVar4 = this.k;
        cg.b bVar5 = cg.b.a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new ah.d(this, 17));
            } else {
                bVar4.setOnClickListener(new bi.o(24));
            }
        }
        vf.b bVar6 = this.n;
        if (bVar6 != null) {
            bVar6.a(false);
            this.n = null;
        }
        int i7 = this.c;
        if (f5Var == null) {
            vf.b h = this.h.h(-1, false, false);
            this.n = h;
            h.d();
            if (this.r.add(bVar)) {
                y8.x(i7, bVar).H(this.a, this.d, this.o, this.p, new ai.s1(12, this, bVar));
                return;
            }
            return;
        }
        cg.b bVar7 = f5Var.a;
        cg.a aVar = f5Var.c;
        long e10 = i10.i(i7).e();
        long j3 = this.d;
        boolean z11 = j3 == e10;
        String str = this.e;
        if (bVar7 == bVar5) {
            c10 = 0;
            this.l.setText(pb.T0(gd.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(org.telegram.messenger.g0.W2(z11 ? gd.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str) : gd.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.n5.t(j3))));
        } else {
            c10 = 0;
        }
        if (bVar7 == bVar3) {
            TextView textView2 = this.l;
            Object[] objArr = new Object[1];
            objArr[c10] = aVar.d();
            textView2.setText(pb.V0(gd.a0(null, null, 2131750265, objArr), true));
            if (z11) {
                String d = aVar.d();
                Object[] objArr2 = new Object[2];
                objArr2[c10] = d;
                objArr2[1] = str;
                a02 = gd.a0(null, null, 2131750257, objArr2);
            } else {
                String d2 = aVar.d();
                String t6 = org.telegram.messenger.n5.t(j3);
                Object[] objArr3 = new Object[3];
                objArr3[c10] = d2;
                objArr3[1] = str;
                objArr3[2] = t6;
                a02 = gd.a0(null, null, 2131750253, objArr3);
            }
            textView.setText(org.telegram.messenger.g0.W2(a02));
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
            hi.u3 u3Var = new hi.u3(this.b, 3);
            u3Var.r(true);
            u3Var.L = Layout.Alignment.ALIGN_NORMAL;
            u3Var.d = 5000L;
            u3Var.v(gd.N0(2131750259, null));
            u3Var.x();
            this.t = u3Var;
            u3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.m.addView(this.t, c8.na.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
