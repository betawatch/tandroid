// default package

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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gh implements jp7, bj0, kac, ee, OnFailureListener, es6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gh(int i, lp7 lp7Var, kj kjVar, lj ljVar, TextView textView) {
        this.a = i;
        this.b = lp7Var;
        this.c = kjVar;
        this.d = ljVar;
        this.e = textView;
    }

    @Override // bj0
    public final void b(fj0 fj0Var, List list) {
        gm.c3(new qu((wg6) this.b, (String) this.c, fj0Var, list, (String) this.d, (String) this.e, this.a));
    }

    @Override // es6
    public final void f(String str, ArrayList arrayList) {
        fdb fdbVar = (fdb) this.b;
        String str2 = (String) this.c;
        HashSet hashSet = (HashSet) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        if (this.a == fdbVar.L) {
            fdbVar.J = (byte) 1;
            fdbVar.K = str2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ds6 ds6Var = (ds6) obj;
                if (!hashSet.contains(ds6Var.a)) {
                    hashSet.add(ds6Var.a);
                    arrayList2.add(ds6Var);
                }
            }
            if (arrayList2.isEmpty()) {
                fdbVar.x = null;
                fdbVar.y = true;
                fdbVar.e();
                return;
            }
            fdbVar.y = false;
            fdbVar.w = false;
            fdbVar.b();
            bdb bdbVar = fdbVar.d;
            if (bdbVar != null) {
                bdbVar.setVisibility(0);
            }
            fdbVar.a0 = gm.L(10.0f);
            fdbVar.x = arrayList;
            fdbVar.b0 = 0;
            fdbVar.c0 = Integer.valueOf(str2.length());
            bdb bdbVar2 = fdbVar.d;
            if (bdbVar2 != null) {
                bdbVar2.invalidate();
            }
            s30 s30Var = fdbVar.f;
            if (s30Var != null) {
                s30Var.f();
            }
        }
    }

    @Override // jp7
    public final void g(lp7 lp7Var, int i) {
        lp7 lp7Var2 = (lp7) this.b;
        kj kjVar = (kj) this.c;
        lj ljVar = (lj) this.d;
        TextView textView = (TextView) this.e;
        ik.g(null, null, 0L, this.a, 3, lp7Var2, kjVar, ljVar);
        ik.e(textView, lp7Var2, kjVar, ljVar);
    }

    @Override // kac
    public final Object j(Integer num, Object obj) {
        int i;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        lea leaVar = (lea) this.b;
        d dVar = (d) this.c;
        Context context = (Context) this.d;
        ylb ylbVar = (ylb) this.e;
        View view = (View) obj;
        yua yuaVar = leaVar.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || leaVar.P) {
            return Boolean.FALSE;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= yuaVar.d().size()) {
                i = -1;
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) yuaVar.d().get(i2)).collection_id == num.intValue()) {
                i = i2;
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) yuaVar.d().get(i2);
                break;
            }
            i2++;
        }
        int i3 = this.a;
        String q = pg3.q(oc7.r1(i3).a2(leaVar.c));
        boolean h = yuaVar.h();
        if (TextUtils.isEmpty(q) && !h) {
            return Boolean.FALSE;
        }
        bu5 I = bu5.I(dVar, view);
        I.X(new ds8(leaVar));
        I.k(R.drawable.menu_gift_add, jb6.M0(2131750171, null), new ur8(leaVar, (byte) 2), h);
        I.k(R.drawable.msg_share, jb6.M0(2131750167, null), new qu(leaVar, i3, q, tL_starGiftCollection, context, ylbVar, dVar), !TextUtils.isEmpty(q));
        I.k(R.drawable.msg_edit, jb6.M0(2131750169, null), new mn8(leaVar, tL_starGiftCollection, (byte) 19), h);
        I.k(R.drawable.tabs_reorder, jb6.M0(2131750168, null), new ur8(leaVar, (byte) 1), h);
        I.l(R.drawable.msg_delete, new h65((Object) leaVar, i, (Object) tL_starGiftCollection, (byte) 27), jb6.M0(2131750170, null), h, true);
        leaVar.J = I;
        I.a0();
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        n1b n1bVar = (n1b) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        int i = this.a;
        t88 t88Var = (t88) this.d;
        h71 h71Var = (h71) this.e;
        n1bVar.y = false;
        fc4.g(exc, true);
        if ((exc instanceof dg7) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1bVar.isAttachedToWindow()) {
            gm.d3(new tda((Object) n1bVar, (Object) bitmap, i, (Object) t88Var, (byte) 4), 2000L);
        } else {
            h71Var.a(new ArrayList());
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        asa asaVar = (asa) this.b;
        Context context = (Context) this.c;
        ylb ylbVar = (ylb) this.d;
        jac jacVar = (jac) this.e;
        yra yraVar = (yra) asaVar.q.get(asaVar.s);
        if (yraVar != null) {
            nk nkVar = yraVar.c;
            jva u = jva.u(this.a, asaVar.s);
            nk m = u.e ? nk.m(u.m()) : null;
            if (m == null || nkVar.b <= m.b) {
                k11 k11Var = asaVar.n;
                if (k11Var != null) {
                    k11Var.a(false);
                    asaVar.n = null;
                }
                jacVar.a(yraVar, heVar.g(i, true, true));
                return;
            }
            ok okVar = asaVar.s;
            if (okVar == ok.a) {
                new dxa(context, ylbVar, nkVar.a(), 14, null, null, 0L).show();
            } else if (okVar == ok.b) {
                new xfb(context, ylbVar, nkVar, null).show();
            }
        }
    }

    public /* synthetic */ gh(wg6 wg6Var, String str, String str2, String str3, int i) {
        this.b = wg6Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.a = i;
    }

    public /* synthetic */ gh(n1b n1bVar, Bitmap bitmap, int i, t88 t88Var, h71 h71Var) {
        this.b = n1bVar;
        this.c = bitmap;
        this.a = i;
        this.d = t88Var;
        this.e = h71Var;
    }

    public /* synthetic */ gh(Object obj, int i, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
