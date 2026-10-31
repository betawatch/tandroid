package jg;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.fe;
import org.telegram.messenger.j20;
import org.telegram.messenger.k20;
import org.telegram.messenger.o5;
import org.telegram.messenger.pw;
import org.telegram.messenger.qi;
import org.telegram.messenger.ri;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.w3;
import org.telegram.ui.Components.x3;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.jl0;
import org.telegram.ui.ll0;
import org.telegram.ui.se0;
import org.telegram.ui.wo0;
import rh.e6;
import rh.u5;
import rh.x7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements OnFailureListener, yb0, ri, org.telegram.messenger.t1, org.telegram.ui.ActionBar.u1, k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q2(int i10, ac0 ac0Var, w3 w3Var, x3 x3Var, TextView textView) {
        this.a = 1;
        this.b = i10;
        this.c = ac0Var;
        this.d = w3Var;
        this.e = x3Var;
        this.f = textView;
    }

    @Override // org.telegram.messenger.t1
    public void a(c5.g gVar, List list) {
        org.telegram.messenger.i0.g3(new fe((se0) this.c, (String) this.d, gVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        sx0 sx0Var = (sx0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != sx0Var.K) {
            return;
        }
        sx0Var.I = 1;
        sx0Var.J = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                qi qiVar = (qi) obj;
                if (!hashSet.contains(qiVar.a)) {
                    hashSet.add(qiVar.a);
                    arrayList2.add(qiVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            sx0Var.x = null;
            sx0Var.y = true;
            sx0Var.f();
            return;
        }
        sx0Var.y = false;
        sx0Var.w = false;
        sx0Var.c();
        l0 l0Var = sx0Var.d;
        if (l0Var != null) {
            l0Var.setVisibility(0);
        }
        sx0Var.W = org.telegram.messenger.i0.L(10.0f);
        sx0Var.x = arrayList;
        sx0Var.a0 = 0;
        sx0Var.b0 = Integer.valueOf(str2.length());
        l0 l0Var2 = sx0Var.d;
        if (l0Var2 != null) {
            l0Var2.invalidate();
        }
        fg.j jVar = sx0Var.f;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // org.telegram.messenger.k20
    public Object d(Number number, Object obj) {
        int i10;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        vq0 vq0Var = (vq0) this.c;
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
        Context context = (Context) this.e;
        p6 p6Var = (p6) this.f;
        Integer num = (Integer) number;
        View view = (View) obj;
        u5 u5Var = vq0Var.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || vq0Var.O) {
            return Boolean.FALSE;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= u5Var.d().size()) {
                i10 = -1;
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) u5Var.d().get(i11)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) u5Var.d().get(i11);
                i10 = i11;
                break;
            }
            i11++;
        }
        int i12 = this.b;
        String r10 = o5.r(vp.r1(i12).d2(vq0Var.c));
        boolean h = u5Var.h();
        if (TextUtils.isEmpty(r10) && !h) {
            return Boolean.FALSE;
        }
        z60 H = z60.H(k2Var, view);
        H.W(new xq0(vq0Var));
        H.l(R.drawable.menu_gift_add, cd.L0(2131750247, null), new ph.m1(vq0Var, 2), h);
        H.l(R.drawable.msg_share, cd.L0(2131750243, null), new fe(vq0Var, i12, r10, tL_starGiftCollection, context, p6Var, k2Var, 17), !TextUtils.isEmpty(r10));
        H.l(R.drawable.msg_edit, cd.L0(2131750245, null), new org.telegram.ui.web.v1(10, vq0Var, tL_starGiftCollection), h);
        H.l(R.drawable.tabs_reorder, cd.L0(2131750244, null), new ph.m1(vq0Var, 1), h);
        H.m(R.drawable.msg_delete, new org.telegram.ui.Wallet.x0(vq0Var, i10, tL_starGiftCollection, 8), cd.L0(2131750246, null), h, true);
        vq0Var.I = H;
        H.Z();
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 4:
                ll0 ll0Var = (ll0) this.c;
                ll0.d0(this.b, (String) this.f, (pw) this.d, (jl0) this.e, ll0Var);
                break;
            default:
                rh.g3 g3Var = (rh.g3) this.c;
                Context context = (Context) this.d;
                p6 p6Var = (p6) this.e;
                j20 j20Var = (j20) this.f;
                rh.d3 d3Var = (rh.d3) g3Var.o.get(g3Var.q);
                if (d3Var != null) {
                    sf.a aVar = d3Var.c;
                    e6 x10 = e6.x(this.b, g3Var.q);
                    sf.a l4 = x10.e ? sf.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        sf.b bVar = g3Var.q;
                        if (bVar != sf.b.a) {
                            if (bVar == sf.b.b) {
                                new wh.f(context, p6Var, d3Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new x7(context, p6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        gf.e eVar = g3Var.n;
                        if (eVar != null) {
                            eVar.a(false);
                            g3Var.n = null;
                        }
                        j20Var.a(d3Var, x1Var.h(i10, true, true));
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        v2 v2Var = (v2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        wo0 wo0Var = (wo0) this.e;
        o2 o2Var = (o2) this.f;
        v2Var.y = false;
        f8.g(exc, true);
        if ((exc instanceof fb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && v2Var.isAttachedToWindow()) {
            org.telegram.messenger.i0.h3(new ag.g3(v2Var, bitmap, i10, wo0Var, 2), 2000L);
        } else {
            o2Var.a(new ArrayList());
        }
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        ac0 ac0Var2 = (ac0) this.c;
        w3 w3Var = (w3) this.d;
        x3 x3Var = (x3) this.e;
        TextView textView = (TextView) this.f;
        s4.g(null, null, 0L, this.b, 3, ac0Var2, w3Var, x3Var);
        s4.e(textView, ac0Var2, w3Var, x3Var);
    }

    public /* synthetic */ q2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ q2(us usVar, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = usVar;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ q2(se0 se0Var, String str, String str2, String str3, int i10) {
        this.a = 3;
        this.c = se0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }
}
