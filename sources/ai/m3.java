package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.e9;
import ci.mb;
import ci.s8;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.ii;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.wv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.en0;
import org.telegram.ui.id0;
import org.telegram.ui.wj0;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements o10, org.telegram.ui.ActionBar.p1, ab0, ii, org.telegram.messenger.q1, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m3(int i3, cb0 cb0Var, org.telegram.ui.Components.x3 x3Var, org.telegram.ui.Components.y3 y3Var, TextView textView) {
        this.a = 2;
        this.b = i3;
        this.e = cb0Var;
        this.f = x3Var;
        this.c = y3Var;
        this.d = textView;
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        int i3;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        vp0 vp0Var = (vp0) this.e;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        s8 s8Var = vp0Var.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || vp0Var.P) {
            return Boolean.FALSE;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= s8Var.d().size()) {
                i3 = -1;
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) s8Var.d().get(i10)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) s8Var.d().get(i10);
                i3 = i10;
                break;
            }
            i10++;
        }
        int i11 = this.b;
        String r5 = org.telegram.messenger.m5.r(hp.s1(i11).e2(vp0Var.c));
        boolean h = s8Var.h();
        if (TextUtils.isEmpty(r5) && !h) {
            return Boolean.FALSE;
        }
        f60 H = f60.H(d2Var, view);
        H.W(new s3(vp0Var));
        H.l(R.drawable.menu_gift_add, bd.M0(2131750246, null), new c3(vp0Var, 2), h);
        H.l(R.drawable.msg_share, bd.M0(2131750242, null), new d3(vp0Var, i11, r5, tL_starGiftCollection, context, e6Var, d2Var, 0), !TextUtils.isEmpty(r5));
        H.l(R.drawable.msg_edit, bd.M0(2131750244, null), new a1.f(5, vp0Var, tL_starGiftCollection), h);
        H.l(R.drawable.tabs_reorder, bd.M0(2131750243, null), new c3(vp0Var, 1), h);
        H.m(R.drawable.msg_delete, new e3(vp0Var, i3, tL_starGiftCollection, 0), bd.M0(2131750245, null), h, true);
        vp0Var.J = H;
        H.Z();
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                ci.n5 n5Var = (ci.n5) this.e;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                n10 n10Var = (n10) this.f;
                ci.l5 l5Var = (ci.l5) n5Var.o.get(n5Var.q);
                if (l5Var != null) {
                    dg.a aVar = l5Var.c;
                    e9 x10 = e9.x(this.b, n5Var.q);
                    dg.a l10 = x10.e ? dg.a.l(x10.p()) : null;
                    if (l10 != null && aVar.b > l10.b) {
                        dg.b bVar = n5Var.q;
                        if (bVar != dg.b.a) {
                            if (bVar == dg.b.b) {
                                new hi.f(context, e6Var, l5Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new mb(context, e6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        sf.b bVar2 = n5Var.n;
                        if (bVar2 != null) {
                            bVar2.a(false);
                            n5Var.n = null;
                        }
                        n10Var.a(l5Var, s1Var.h(i3, true, true));
                        break;
                    }
                }
                break;
            default:
                yj0 yj0Var = (yj0) this.e;
                yj0.e0(this.b, (String) this.d, (wv) this.f, (wj0) this.c, yj0Var);
                break;
        }
    }

    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        ow0 ow0Var = (ow0) this.e;
        String str2 = (String) this.f;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.b != ow0Var.L) {
            return;
        }
        ow0Var.J = 1;
        ow0Var.K = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hi hiVar = (hi) obj;
                if (!hashSet.contains(hiVar.a)) {
                    hashSet.add(hiVar.a);
                    arrayList2.add(hiVar);
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
        kw0 kw0Var = ow0Var.d;
        if (kw0Var != null) {
            kw0Var.setVisibility(0);
        }
        ow0Var.a0 = org.telegram.messenger.g0.L(10.0f);
        ow0Var.x = arrayList;
        ow0Var.b0 = 0;
        ow0Var.c0 = Integer.valueOf(str2.length());
        kw0 kw0Var2 = ow0Var.d;
        if (kw0Var2 != null) {
            kw0Var2.invalidate();
        }
        org.telegram.ui.n4 n4Var = ow0Var.f;
        if (n4Var != null) {
            n4Var.f();
        }
    }

    @Override // org.telegram.messenger.q1
    public void k(e5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new d3((id0) this.e, (String) this.f, fVar, list, (String) this.c, (String) this.d, this.b));
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        cb0 cb0Var2 = (cb0) this.e;
        org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) this.f;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.c;
        TextView textView = (TextView) this.d;
        org.telegram.ui.Components.t4.g(null, null, 0L, this.b, 3, cb0Var2, x3Var, y3Var);
        org.telegram.ui.Components.t4.e(textView, cb0Var2, x3Var, y3Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ug.c2 c2Var = (ug.c2) this.e;
        Bitmap bitmap = (Bitmap) this.f;
        int i3 = this.b;
        en0 en0Var = (en0) this.c;
        g3 g3Var = (g3) this.d;
        c2Var.y = false;
        a8.g(exc, true);
        if ((exc instanceof ib.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && c2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new zo0(c2Var, bitmap, i3, en0Var, 24), 2000L);
        } else {
            g3Var.a(new ArrayList());
        }
    }

    public /* synthetic */ m3(FrameLayout frameLayout, int i3, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = frameLayout;
        this.b = i3;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ m3(ci.n5 n5Var, int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, n10 n10Var) {
        this.a = 1;
        this.e = n5Var;
        this.b = i3;
        this.c = context;
        this.d = e6Var;
        this.f = n10Var;
    }

    public /* synthetic */ m3(cs csVar, Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = csVar;
        this.f = obj;
        this.b = i3;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ m3(id0 id0Var, String str, String str2, String str3, int i3) {
        this.a = 4;
        this.e = id0Var;
        this.f = str;
        this.c = str2;
        this.d = str3;
        this.b = i3;
    }
}
