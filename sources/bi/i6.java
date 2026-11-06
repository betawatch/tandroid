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
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.bk0;
import org.telegram.ui.d10;
import org.telegram.ui.jn0;
import org.telegram.ui.ld0;
import org.telegram.ui.zj0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements org.telegram.ui.ActionBar.r1, fb0, ri, org.telegram.messenger.q1, OnFailureListener, w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i6(int i7, hb0 hb0Var, org.telegram.ui.Components.z3 z3Var, org.telegram.ui.Components.a4 a4Var, TextView textView) {
        this.a = 1;
        this.b = i7;
        this.c = hb0Var;
        this.d = z3Var;
        this.e = a4Var;
        this.f = textView;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new jg.c1((ld0) this.c, (String) this.d, fVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        up0 up0Var = (up0) this.c;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
        Integer num = (Integer) number;
        View view = (View) obj;
        t9 t9Var = up0Var.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || up0Var.O) {
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
        String r10 = org.telegram.messenger.m5.r(qp.s1(i11).e2(up0Var.c));
        boolean h = t9Var.h();
        if (TextUtils.isEmpty(r10) && !h) {
            return Boolean.FALSE;
        }
        k60 H = k60.H(f2Var, view);
        H.W(new wp0(up0Var));
        H.l(R.drawable.menu_gift_add, org.telegram.messenger.hd.M0(2131750237, null), new zh.i1(up0Var, 2), h);
        H.l(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131750233, null), new jg.c1(up0Var, i11, r10, tL_starGiftCollection, context, f6Var, f2Var, 18), !TextUtils.isEmpty(r10));
        H.l(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131750235, null), new wi.q(13, up0Var, tL_starGiftCollection), h);
        H.l(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131750234, null), new zh.i1(up0Var, 1), h);
        H.m(R.drawable.msg_delete, new d10(up0Var, i7, tL_starGiftCollection, 26), org.telegram.messenger.hd.M0(2131750236, null), h, true);
        up0Var.I = H;
        H.Z();
        return Boolean.TRUE;
    }

    @Override // org.telegram.messenger.ri
    public void e(String str, ArrayList arrayList) {
        ow0 ow0Var = (ow0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != ow0Var.K) {
            return;
        }
        ow0Var.I = 1;
        ow0Var.J = str2;
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
            ow0Var.x = null;
            ow0Var.y = true;
            ow0Var.f();
            return;
        }
        ow0Var.y = false;
        ow0Var.w = false;
        ow0Var.c();
        e5 e5Var = ow0Var.d;
        if (e5Var != null) {
            e5Var.setVisibility(0);
        }
        ow0Var.W = org.telegram.messenger.g0.L(10.0f);
        ow0Var.x = arrayList;
        ow0Var.a0 = 0;
        ow0Var.b0 = Integer.valueOf(str2.length());
        e5 e5Var2 = ow0Var.d;
        if (e5Var2 != null) {
            e5Var2.invalidate();
        }
        org.telegram.ui.l4 l4Var = ow0Var.f;
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
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
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
                                new gi.e(context, f6Var, h6Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new tc(context, f6Var, aVar.a(), 14, null, null, 0L).show();
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
                bk0 bk0Var = (bk0) this.c;
                bk0.e0(this.b, (String) this.f, (ew) this.d, (zj0) this.e, bk0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb0
    public void n(hb0 hb0Var, int i7) {
        hb0 hb0Var2 = (hb0) this.c;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.d;
        org.telegram.ui.Components.a4 a4Var = (org.telegram.ui.Components.a4) this.e;
        TextView textView = (TextView) this.f;
        org.telegram.ui.Components.v4.g(null, null, 0L, this.b, 3, hb0Var2, z3Var, a4Var);
        org.telegram.ui.Components.v4.e(textView, hb0Var2, z3Var, a4Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.c2 c2Var = (tg.c2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i7 = this.b;
        jn0 jn0Var = (jn0) this.e;
        hi.d4 d4Var = (hi.d4) this.f;
        c2Var.y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && c2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new pp0(c2Var, bitmap, i7, jn0Var, 23), 2000L);
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

    public /* synthetic */ i6(up0 up0Var, int i7, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 6;
        this.c = up0Var;
        this.b = i7;
        this.f = f2Var;
        this.d = context;
        this.e = f6Var;
    }

    public /* synthetic */ i6(ld0 ld0Var, String str, String str2, String str3, int i7) {
        this.a = 3;
        this.c = ld0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i7;
    }
}
