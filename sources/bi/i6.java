package bi;

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
import org.telegram.messenger.ew;
import org.telegram.messenger.ls;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.ri;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.bk0;
import org.telegram.ui.dk0;
import org.telegram.ui.f10;
import org.telegram.ui.ln0;
import org.telegram.ui.nd0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements org.telegram.ui.ActionBar.r1, gb0, ri, org.telegram.messenger.q1, OnFailureListener, w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i6(int i7, ib0 ib0Var, org.telegram.ui.Components.z3 z3Var, org.telegram.ui.Components.a4 a4Var, TextView textView) {
        this.a = 1;
        this.b = i7;
        this.c = ib0Var;
        this.d = z3Var;
        this.e = a4Var;
        this.f = textView;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new jg.c1((nd0) this.c, (String) this.d, fVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        vp0 vp0Var = (vp0) this.c;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
        Integer num = (Integer) number;
        View view = (View) obj;
        t9 t9Var = vp0Var.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || vp0Var.O) {
            return Boolean.FALSE;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= t9Var.d().size()) {
                i7 = -1;
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) t9Var.d().get(i10)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) t9Var.d().get(i10);
                i7 = i10;
                break;
            }
            i10++;
        }
        int i11 = this.b;
        String r10 = org.telegram.messenger.m5.r(qp.s1(i11).e2(vp0Var.c));
        boolean h = t9Var.h();
        if (TextUtils.isEmpty(r10) && !h) {
            return Boolean.FALSE;
        }
        l60 H = l60.H(f2Var, view);
        H.W(new xp0(vp0Var));
        H.l(R.drawable.menu_gift_add, org.telegram.messenger.id.M0(2131750238, null), new zh.h1(vp0Var, 2), h);
        H.l(R.drawable.msg_share, org.telegram.messenger.id.M0(2131750234, null), new jg.c1(vp0Var, i11, r10, tL_starGiftCollection, context, g6Var, f2Var, 18), !TextUtils.isEmpty(r10));
        H.l(R.drawable.msg_edit, org.telegram.messenger.id.M0(2131750236, null), new yf.b(9, vp0Var, tL_starGiftCollection), h);
        H.l(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131750235, null), new zh.h1(vp0Var, 1), h);
        H.m(R.drawable.msg_delete, new f10(vp0Var, i7, tL_starGiftCollection, 25), org.telegram.messenger.id.M0(2131750237, null), h, true);
        vp0Var.I = H;
        H.Z();
        return Boolean.TRUE;
    }

    @Override // org.telegram.messenger.ri
    public void e(String str, ArrayList arrayList) {
        pw0 pw0Var = (pw0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != pw0Var.K) {
            return;
        }
        pw0Var.I = 1;
        pw0Var.J = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                qi qiVar = (qi) obj;
                if (!hashSet.contains(qiVar.a)) {
                    hashSet.add(qiVar.a);
                    arrayList2.add(qiVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            pw0Var.x = null;
            pw0Var.y = true;
            pw0Var.f();
            return;
        }
        pw0Var.y = false;
        pw0Var.w = false;
        pw0Var.c();
        e5 e5Var = pw0Var.d;
        if (e5Var != null) {
            e5Var.setVisibility(0);
        }
        pw0Var.W = org.telegram.messenger.g0.L(10.0f);
        pw0Var.x = arrayList;
        pw0Var.a0 = 0;
        pw0Var.b0 = Integer.valueOf(str2.length());
        e5 e5Var2 = pw0Var.d;
        if (e5Var2 != null) {
            e5Var2.invalidate();
        }
        org.telegram.ui.l4 l4Var = pw0Var.f;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                k6 k6Var = (k6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                v10 v10Var = (v10) this.f;
                h6 h6Var = (h6) k6Var.o.get(k6Var.q);
                if (h6Var != null) {
                    cg.a aVar = h6Var.c;
                    ea x10 = ea.x(this.b, k6Var.q);
                    cg.a l10 = x10.e ? cg.a.l(x10.p()) : null;
                    if (l10 != null && aVar.b > l10.b) {
                        cg.b bVar = k6Var.q;
                        if (bVar != cg.b.a) {
                            if (bVar == cg.b.b) {
                                new gi.e(context, g6Var, h6Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new tc(context, g6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        vf.b bVar2 = k6Var.n;
                        if (bVar2 != null) {
                            bVar2.a(false);
                            k6Var.n = null;
                        }
                        v10Var.a(h6Var, u1Var.h(i7, true, true));
                        break;
                    }
                }
                break;
            default:
                dk0 dk0Var = (dk0) this.c;
                dk0.e0(this.b, (String) this.f, (ew) this.d, (bk0) this.e, dk0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public void n(ib0 ib0Var, int i7) {
        ib0 ib0Var2 = (ib0) this.c;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.d;
        org.telegram.ui.Components.a4 a4Var = (org.telegram.ui.Components.a4) this.e;
        TextView textView = (TextView) this.f;
        org.telegram.ui.Components.v4.g(null, null, 0L, this.b, 3, ib0Var2, z3Var, a4Var);
        org.telegram.ui.Components.v4.e(textView, ib0Var2, z3Var, a4Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.c2 c2Var = (tg.c2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i7 = this.b;
        ln0 ln0Var = (ln0) this.e;
        hi.d4 d4Var = (hi.d4) this.f;
        c2Var.y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && c2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new qp0(c2Var, bitmap, i7, ln0Var, 23), 2000L);
        } else {
            d4Var.a(new ArrayList());
        }
    }

    public /* synthetic */ i6(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ i6(ls lsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = lsVar;
        this.d = obj;
        this.b = i7;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ i6(vp0 vp0Var, int i7, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = 6;
        this.c = vp0Var;
        this.b = i7;
        this.f = f2Var;
        this.d = context;
        this.e = g6Var;
    }

    public /* synthetic */ i6(nd0 nd0Var, String str, String str2, String str3, int i7) {
        this.a = 3;
        this.c = nd0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i7;
    }
}
