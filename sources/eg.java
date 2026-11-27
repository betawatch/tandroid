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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eg implements fq7, ci0, jcc, fd, OnFailureListener, is6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eg(int i, hq7 hq7Var, li liVar, mi miVar, TextView textView) {
        this.a = i;
        this.b = hq7Var;
        this.c = liVar;
        this.d = miVar;
        this.e = textView;
    }

    @Override // is6
    public final void b(String str, ArrayList arrayList) {
        zeb zebVar = (zeb) this.b;
        String str2 = (String) this.c;
        HashSet hashSet = (HashSet) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        if (this.a == zebVar.L) {
            zebVar.J = (byte) 1;
            zebVar.K = str2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hs6 hs6Var = (hs6) obj;
                if (!hashSet.contains(hs6Var.a)) {
                    hashSet.add(hs6Var.a);
                    arrayList2.add(hs6Var);
                }
            }
            if (arrayList2.isEmpty()) {
                zebVar.x = null;
                zebVar.y = true;
                zebVar.e();
                return;
            }
            zebVar.y = false;
            zebVar.w = false;
            zebVar.b();
            h8b h8bVar = zebVar.d;
            if (h8bVar != null) {
                h8bVar.setVisibility(0);
            }
            zebVar.a0 = hl.L(10.0f);
            zebVar.x = arrayList;
            zebVar.b0 = 0;
            zebVar.c0 = Integer.valueOf(str2.length());
            h8b h8bVar2 = zebVar.d;
            if (h8bVar2 != null) {
                h8bVar2.invalidate();
            }
            t20 t20Var = zebVar.f;
            if (t20Var != null) {
                t20Var.f();
            }
        }
    }

    @Override // ci0
    public final void c(gi0 gi0Var, List list) {
        hl.c3(new st((zg6) this.b, (String) this.c, gi0Var, list, (String) this.d, (String) this.e, this.a));
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        int i;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        cga cgaVar = (cga) this.b;
        e eVar = (e) this.c;
        Context context = (Context) this.d;
        vnb vnbVar = (vnb) this.e;
        View view = (View) obj;
        zwa zwaVar = cgaVar.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || cgaVar.P) {
            return Boolean.FALSE;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= zwaVar.d().size()) {
                i = -1;
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) zwaVar.d().get(i2)).collection_id == num.intValue()) {
                i = i2;
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) zwaVar.d().get(i2);
                break;
            }
            i2++;
        }
        int i3 = this.a;
        String q = wf3.q(uc7.s1(i3).b2(cgaVar.c));
        boolean h = zwaVar.h();
        if (TextUtils.isEmpty(q) && !h) {
            return Boolean.FALSE;
        }
        fu5 I = fu5.I(eVar, view);
        I.X(new nt8(cgaVar));
        I.k(R.drawable.menu_gift_add, ob6.M0(2131750197, null), new ft8(cgaVar, (byte) 2), h);
        I.k(R.drawable.msg_share, ob6.M0(2131750193, null), new st(cgaVar, i3, q, tL_starGiftCollection, context, vnbVar, eVar), !TextUtils.isEmpty(q));
        I.k(R.drawable.msg_edit, ob6.M0(2131750195, null), new ep8(cgaVar, tL_starGiftCollection, (byte) 16), h);
        I.k(R.drawable.tabs_reorder, ob6.M0(2131750194, null), new ft8(cgaVar, (byte) 1), h);
        I.l(R.drawable.msg_delete, new l65((Object) cgaVar, i, (Object) tL_starGiftCollection, (byte) 28), ob6.M0(2131750196, null), h, true);
        cgaVar.J = I;
        I.a0();
        return Boolean.TRUE;
    }

    @Override // fq7
    public final void i(hq7 hq7Var, int i) {
        hq7 hq7Var2 = (hq7) this.b;
        li liVar = (li) this.c;
        mi miVar = (mi) this.d;
        TextView textView = (TextView) this.e;
        jj.g(null, null, 0L, this.a, 3, hq7Var2, liVar, miVar);
        jj.e(textView, hq7Var2, liVar, miVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        k3b k3bVar = (k3b) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        int i = this.a;
        ea8 ea8Var = (ea8) this.d;
        i61 i61Var = (i61) this.e;
        k3bVar.y = false;
        cc4.g(exc, true);
        if ((exc instanceof lg7) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && k3bVar.isAttachedToWindow()) {
            hl.d3(new efa((Object) k3bVar, (Object) bitmap, i, (Object) ea8Var, (byte) 5), 2000L);
        } else {
            i61Var.a(new ArrayList());
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        bua buaVar = (bua) this.b;
        Context context = (Context) this.c;
        vnb vnbVar = (vnb) this.d;
        icc iccVar = (icc) this.e;
        us0 us0Var = buaVar.k;
        pj pjVar = pj.b;
        if (us0Var != null && buaVar.t == pjVar) {
            idVar.dismiss();
            buaVar.k.run();
            return;
        }
        zta ztaVar = (zta) buaVar.r.get(buaVar.t);
        if (ztaVar != null) {
            oj ojVar = ztaVar.c;
            jxa u = jxa.u(this.a, buaVar.t);
            oj m = u.e ? oj.m(u.m()) : null;
            if (m == null || ojVar.b <= m.b) {
                l01 l01Var = buaVar.o;
                if (l01Var != null) {
                    l01Var.a(false);
                    buaVar.o = null;
                }
                iccVar.a(ztaVar, idVar.g(i, true, true));
                return;
            }
            pj pjVar2 = buaVar.t;
            if (pjVar2 == pj.a) {
                new dza(context, vnbVar, ojVar.a(), 14, null, null, 0L).show();
            } else if (pjVar2 == pjVar) {
                new shb(context, vnbVar, ojVar, null).show();
            }
        }
    }

    public /* synthetic */ eg(zg6 zg6Var, String str, String str2, String str3, int i) {
        this.b = zg6Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.a = i;
    }

    public /* synthetic */ eg(k3b k3bVar, Bitmap bitmap, int i, ea8 ea8Var, i61 i61Var) {
        this.b = k3bVar;
        this.c = bitmap;
        this.a = i;
        this.d = ea8Var;
        this.e = i61Var;
    }

    public /* synthetic */ eg(Object obj, Object obj2, int i, Object obj3, Object obj4) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
