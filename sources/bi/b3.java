package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import di.bb;
import di.j8;
import di.u8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cw;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.ck0;
import org.telegram.ui.ek0;
import org.telegram.ui.kd0;
import org.telegram.ui.ln0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements t10, org.telegram.ui.ActionBar.q1, gb0, pi, org.telegram.messenger.q1, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b3(int i7, ib0 ib0Var, org.telegram.ui.Components.x3 x3Var, org.telegram.ui.Components.y3 y3Var, TextView textView) {
        this.a = 2;
        this.b = i7;
        this.e = ib0Var;
        this.f = x3Var;
        this.c = y3Var;
        this.d = textView;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new u2((kd0) this.e, (String) this.f, fVar, list, (String) this.c, (String) this.d, this.b));
    }

    @Override // org.telegram.messenger.pi
    public void c(String str, ArrayList arrayList) {
        rw0 rw0Var = (rw0) this.e;
        String str2 = (String) this.f;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.b != rw0Var.L) {
            return;
        }
        rw0Var.J = 1;
        rw0Var.K = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                oi oiVar = (oi) obj;
                if (!hashSet.contains(oiVar.a)) {
                    hashSet.add(oiVar.a);
                    arrayList2.add(oiVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            rw0Var.x = null;
            rw0Var.y = true;
            rw0Var.f();
            return;
        }
        rw0Var.y = false;
        rw0Var.w = false;
        rw0Var.c();
        g2 g2Var = rw0Var.d;
        if (g2Var != null) {
            g2Var.setVisibility(0);
        }
        rw0Var.a0 = org.telegram.messenger.g0.L(10.0f);
        rw0Var.x = arrayList;
        rw0Var.b0 = 0;
        rw0Var.c0 = Integer.valueOf(str2.length());
        g2 g2Var2 = rw0Var.d;
        if (g2Var2 != null) {
            g2Var2.invalidate();
        }
        org.telegram.ui.l4 l4Var = rw0Var.f;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        wp0 wp0Var = (wp0) this.e;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        j8 j8Var = wp0Var.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || wp0Var.P) {
            return Boolean.FALSE;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= j8Var.d().size()) {
                i7 = -1;
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) j8Var.d().get(i10)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) j8Var.d().get(i10);
                i7 = i10;
                break;
            }
            i10++;
        }
        int i11 = this.b;
        String r10 = org.telegram.messenger.m5.r(np.s1(i11).e2(wp0Var.c));
        boolean h = j8Var.h();
        if (TextUtils.isEmpty(r10) && !h) {
            return Boolean.FALSE;
        }
        m60 H = m60.H(e2Var, view);
        H.W(new h3(wp0Var));
        H.l(R.drawable.menu_gift_add, hd.M0(2131750238, null), new t2(wp0Var, 2), h);
        H.l(R.drawable.msg_share, hd.M0(2131750234, null), new u2(wp0Var, i11, r10, tL_starGiftCollection, context, e6Var, e2Var, 0), !TextUtils.isEmpty(r10));
        H.l(R.drawable.msg_edit, hd.M0(2131750236, null), new a1.e(27, wp0Var, tL_starGiftCollection), h);
        H.l(R.drawable.tabs_reorder, hd.M0(2131750235, null), new t2(wp0Var, 1), h);
        H.m(R.drawable.msg_delete, new ai.a1(wp0Var, i7, tL_starGiftCollection, 2), hd.M0(2131750237, null), h, true);
        wp0Var.J = H;
        H.Z();
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                di.e5 e5Var = (di.e5) this.e;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                s10 s10Var = (s10) this.f;
                di.c5 c5Var = (di.c5) e5Var.o.get(e5Var.q);
                if (c5Var != null) {
                    cg.a aVar = c5Var.c;
                    u8 x10 = u8.x(this.b, e5Var.q);
                    cg.a l10 = x10.e ? cg.a.l(x10.p()) : null;
                    if (l10 != null && aVar.b > l10.b) {
                        cg.b bVar = e5Var.q;
                        if (bVar != cg.b.a) {
                            if (bVar == cg.b.b) {
                                new ii.e(context, e6Var, c5Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new bb(context, e6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        vf.b bVar2 = e5Var.n;
                        if (bVar2 != null) {
                            bVar2.a(false);
                            e5Var.n = null;
                        }
                        s10Var.a(c5Var, t1Var.h(i7, true, true));
                        break;
                    }
                }
                break;
            default:
                ek0 ek0Var = (ek0) this.e;
                ek0.e0(this.b, (String) this.d, (cw) this.f, (ck0) this.c, ek0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public void m(ib0 ib0Var, int i7) {
        ib0 ib0Var2 = (ib0) this.e;
        org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) this.f;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.c;
        TextView textView = (TextView) this.d;
        org.telegram.ui.Components.t4.g(null, null, 0L, this.b, 3, ib0Var2, x3Var, y3Var);
        org.telegram.ui.Components.t4.e(textView, ib0Var2, x3Var, y3Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.e2 e2Var = (tg.e2) this.e;
        Bitmap bitmap = (Bitmap) this.f;
        int i7 = this.b;
        ln0 ln0Var = (ln0) this.c;
        w2 w2Var = (w2) this.d;
        e2Var.y = false;
        a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && e2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new sp0(e2Var, bitmap, i7, ln0Var, 23), 2000L);
        } else {
            w2Var.a(new ArrayList());
        }
    }

    public /* synthetic */ b3(FrameLayout frameLayout, int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = frameLayout;
        this.b = i7;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ b3(di.e5 e5Var, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, s10 s10Var) {
        this.a = 1;
        this.e = e5Var;
        this.b = i7;
        this.c = context;
        this.d = e6Var;
        this.f = s10Var;
    }

    public /* synthetic */ b3(is isVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = isVar;
        this.f = obj;
        this.b = i7;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ b3(kd0 kd0Var, String str, String str2, String str3, int i7) {
        this.a = 4;
        this.e = kd0Var;
        this.f = str;
        this.c = str2;
        this.d = str3;
        this.b = i7;
    }
}
