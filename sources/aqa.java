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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class aqa {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final wjb g;
    public final hd h;
    public final xf5 i;
    public final TextView j;
    public ge0 k;
    public TextView l;
    public FrameLayout m;
    public c01 n;
    public TLRPC.TL_textWithEntities o;
    public boolean p = true;
    public final HashMap q;
    public final HashSet r;
    public oj s;
    public je5 t;

    public aqa(Context context, wjb wjbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, ypa ypaVar, int i, long j, String str, boolean z, i8c i8cVar) {
        HashMap hashMap = new HashMap();
        this.q = hashMap;
        this.r = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j;
        this.c = i;
        oj ojVar = ypaVar.a;
        this.s = ojVar;
        hashMap.put(ojVar, ypaVar);
        this.g = wjbVar;
        this.e = str;
        boolean z2 = tL_starGiftUnique.resale_ton_only;
        this.f = !z2;
        TLObject V1 = j >= 0 ? na7.q1(i).V1(Long.valueOf(j)) : na7.q1(i).K0(Long.valueOf(-j));
        LinearLayout j2 = de9.j(context, 1);
        zpa zpaVar = new zpa(this, context);
        zpaVar.addView(j2, nme.c(-2.0f, -1));
        if (z2) {
            this.i = null;
            TextView textView = new TextView(context);
            zkb.X(textView, bkb.x6, wjbVar);
            ir2.r(14.0f, 1, 2131750261, textView, null);
            textView.setGravity(17);
            j2.addView(textView, nme.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            xf5 xf5Var = new xf5(context, wjbVar);
            this.i = xf5Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(k96.M0(2131750263, null));
            arrayList.add(k96.M0(2131750262, null));
            xf5Var.b(arrayList, new re1(this, (byte) 6));
            j2.addView(xf5Var, nme.t(-2, -2, 1, 18, 0, 18, 12));
        }
        j2.addView(new wpa(context, tL_starGiftUnique, V1), nme.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        zkb.X(textView2, bkb.i5, wjbVar);
        textView2.setTextSize(1, 16.0f);
        j2.addView(textView2, nme.t(-1, -2, 48, 24, 4, 24, 4));
        if (z) {
            mfb mfbVar = new mfb(context, wjbVar);
            vqa.Z0(mfbVar, gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            vqa.Z0(mfbVar, gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            vqa.Z0(mfbVar, gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                ci0.h();
                mfbVar.f(k96.M0(2131749416, null), b00.h("~", ci0.f(tL_starGiftUnique.value_currency, ci0.h().g(tL_starGiftUnique.value_currency), tL_starGiftUnique.value_amount, true)), null, null);
            }
            j2.addView(mfbVar, nme.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        alertDialog$Builder.n(zpaVar);
        alertDialog$Builder.j("_", new gg(this, i, context, wjbVar, i8cVar));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z) {
        char c;
        String a0;
        je5 je5Var;
        oj ojVar = this.s;
        ypa ypaVar = (ypa) this.q.get(ojVar);
        TextView textView = this.j;
        textView.animate().alpha(ypaVar != null ? 1.0f : 0.25f).start();
        byte b = 1;
        textView.setEnabled(ypaVar != null);
        this.l.setEnabled(ypaVar != null);
        ge0 ge0Var = this.k;
        if (ge0Var.e != ojVar) {
            ge0Var.e = ojVar;
            ge0Var.b();
        }
        oj ojVar2 = oj.b;
        xf5 xf5Var = this.i;
        if (xf5Var != null) {
            xf5Var.a(ojVar == ojVar2 ? 1 : 0, z);
        }
        if (ojVar == ojVar2 && (je5Var = this.t) != null && je5Var.W) {
            je5Var.f(true);
        }
        ge0 ge0Var2 = this.k;
        byte b2 = 3;
        oj ojVar3 = oj.a;
        if (ge0Var2 != null) {
            if (ojVar == ojVar3) {
                ge0Var2.setOnClickListener(new bna(this, b2));
            } else {
                ge0Var2.setOnClickListener(new x00(b));
            }
        }
        c01 c01Var = this.n;
        if (c01Var != null) {
            c01Var.a(false);
            this.n = null;
        }
        int i = this.c;
        if (ypaVar == null) {
            c01 g = this.h.g(-1, false, false);
            this.n = g;
            g.d();
            if (this.r.add(ojVar)) {
                gta.u(i, ojVar).E(this.a, this.d, this.o, this.p, new nu9(this, ojVar, (byte) 11));
                return;
            }
            return;
        }
        oj ojVar4 = ypaVar.a;
        nj njVar = ypaVar.c;
        long e = y6c.h(i).e();
        long j = this.d;
        boolean z2 = j == e;
        String str = this.e;
        if (ojVar4 == ojVar3) {
            c = 0;
            this.l.setText(jva.S0(k96.H(',', "Gift2BuyDoPrice2", (int) njVar.a())));
            textView.setText(gl.T2(z2 ? k96.K("Gift2BuyPriceSelfText", (int) njVar.a(), ',', str) : k96.K("Gift2BuyPriceText", (int) njVar.a(), ',', str, cf3.s(j))));
            ojVar2 = ojVar2;
        } else {
            c = 0;
        }
        if (ojVar4 == ojVar2) {
            TextView textView2 = this.l;
            Object[] objArr = new Object[1];
            objArr[c] = njVar.d();
            textView2.setText(jva.U0(k96.a0(null, null, 2131750266, objArr), true));
            if (z2) {
                Object[] objArr2 = new Object[2];
                objArr2[c] = njVar.d();
                objArr2[1] = str;
                a0 = k96.a0(null, null, 2131750258, objArr2);
            } else {
                String d = njVar.d();
                String s = cf3.s(j);
                Object[] objArr3 = new Object[3];
                objArr3[c] = d;
                objArr3[1] = str;
                objArr3[2] = s;
                a0 = k96.a0(null, null, 2131750254, objArr3);
            }
            textView.setText(gl.T2(a0));
        }
    }

    public final void b() {
        hd hdVar = this.h;
        hdVar.Y0 = true;
        hdVar.show();
        this.l = (TextView) hdVar.c(-1);
        this.k = hdVar.a1;
        FrameLayout frameLayout = hdVar.Z0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            je5 je5Var = new je5(this.b, 3);
            je5Var.p(true);
            je5Var.L = Layout.Alignment.ALIGN_NORMAL;
            je5Var.d = 5000L;
            je5Var.t(k96.M0(2131750260, null));
            je5Var.v();
            this.t = je5Var;
            je5Var.setPadding(gl.L(7.33f), 0, gl.L(7.33f), 0);
            this.m.addView(this.t, nme.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
