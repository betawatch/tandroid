package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import di.fb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.r10;
import org.telegram.messenger.s10;
import org.telegram.messenger.zv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.fk0;
import org.telegram.ui.hk0;
import org.telegram.ui.ld0;
import org.telegram.ui.on0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements s10, org.telegram.ui.ActionBar.q1, rb0, pi, org.telegram.messenger.q1, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l5(int i7, tb0 tb0Var, org.telegram.ui.Components.g4 g4Var, org.telegram.ui.Components.h4 h4Var, TextView textView) {
        this.a = 2;
        this.b = i7;
        this.e = tb0Var;
        this.f = g4Var;
        this.c = h4Var;
        this.d = textView;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new f5((ld0) this.e, (String) this.f, fVar, list, (String) this.c, (String) this.d, this.b));
    }

    @Override // org.telegram.messenger.pi
    public void e(String str, ArrayList arrayList) {
        ax0 ax0Var = (ax0) this.e;
        String str2 = (String) this.f;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.b != ax0Var.L) {
            return;
        }
        ax0Var.J = 1;
        ax0Var.K = str2;
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
            ax0Var.x = null;
            ax0Var.y = true;
            ax0Var.f();
            return;
        }
        ax0Var.y = false;
        ax0Var.w = false;
        ax0Var.c();
        e3 e3Var = ax0Var.d;
        if (e3Var != null) {
            e3Var.setVisibility(0);
        }
        ax0Var.a0 = org.telegram.messenger.g0.L(10.0f);
        ax0Var.x = arrayList;
        ax0Var.b0 = 0;
        ax0Var.c0 = Integer.valueOf(str2.length());
        e3 e3Var2 = ax0Var.d;
        if (e3Var2 != null) {
            e3Var2.invalidate();
        }
        org.telegram.ui.l4 l4Var = ax0Var.f;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override // org.telegram.messenger.s10
    public Object g(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        gq0 gq0Var = (gq0) this.e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        di.n8 n8Var = gq0Var.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || gq0Var.P) {
            return Boolean.FALSE;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= n8Var.d().size()) {
                i7 = -1;
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) n8Var.d().get(i10)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) n8Var.d().get(i10);
                i7 = i10;
                break;
            }
            i10++;
        }
        int i11 = this.b;
        String r10 = org.telegram.messenger.n5.r(np.u1(i11).g2(gq0Var.c));
        boolean h = n8Var.h();
        if (TextUtils.isEmpty(r10) && !h) {
            return Boolean.FALSE;
        }
        a70 I = a70.I(g2Var, view);
        I.X(new r5(gq0Var));
        I.l(R.drawable.menu_gift_add, hd.N0(2131750221, null), new e5(gq0Var, 2), h);
        I.l(R.drawable.msg_share, hd.N0(2131750217, null), new f5(gq0Var, i11, r10, tL_starGiftCollection, context, h6Var, g2Var, 0), !TextUtils.isEmpty(r10));
        I.l(R.drawable.msg_edit, hd.N0(2131750219, null), new a1.e(28, gq0Var, tL_starGiftCollection), h);
        I.l(R.drawable.tabs_reorder, hd.N0(2131750218, null), new e5(gq0Var, 1), h);
        I.m(R.drawable.msg_delete, new ai.j1(gq0Var, i7, tL_starGiftCollection, 2), hd.N0(2131750220, null), h, true);
        gq0Var.J = I;
        I.a0();
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                di.h5 h5Var = (di.h5) this.e;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                r10 r10Var = (r10) this.f;
                di.f5 f5Var = (di.f5) h5Var.q.get(h5Var.s);
                if (f5Var != null) {
                    cg.a aVar = f5Var.c;
                    di.y8 x10 = di.y8.x(this.b, h5Var.s);
                    cg.a m10 = x10.e ? cg.a.m(x10.p()) : null;
                    if (m10 != null && aVar.b > m10.b) {
                        cg.b bVar = h5Var.s;
                        if (bVar != cg.b.a) {
                            if (bVar == cg.b.b) {
                                new ii.s(context, h6Var, f5Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new fb(context, h6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        vf.b bVar2 = h5Var.n;
                        if (bVar2 != null) {
                            bVar2.a(false);
                            h5Var.n = null;
                        }
                        r10Var.a(f5Var, t1Var.h(i7, true, true));
                        break;
                    }
                }
                break;
            default:
                hk0 hk0Var = (hk0) this.e;
                hk0.e0(this.b, (String) this.d, (zv) this.f, (fk0) this.c, hk0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.rb0
    public void n(tb0 tb0Var, int i7) {
        tb0 tb0Var2 = (tb0) this.e;
        org.telegram.ui.Components.g4 g4Var = (org.telegram.ui.Components.g4) this.f;
        org.telegram.ui.Components.h4 h4Var = (org.telegram.ui.Components.h4) this.c;
        TextView textView = (TextView) this.d;
        org.telegram.ui.Components.c5.g(null, null, 0L, this.b, 3, tb0Var2, g4Var, h4Var);
        org.telegram.ui.Components.c5.e(textView, tb0Var2, g4Var, h4Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.f2 f2Var = (tg.f2) this.e;
        Bitmap bitmap = (Bitmap) this.f;
        int i7 = this.b;
        on0 on0Var = (on0) this.c;
        g5 g5Var = (g5) this.d;
        f2Var.y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && f2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new lp0(f2Var, bitmap, i7, on0Var, 25), 2000L);
        } else {
            g5Var.a(new ArrayList());
        }
    }

    public /* synthetic */ l5(FrameLayout frameLayout, int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = frameLayout;
        this.b = i7;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ l5(di.h5 h5Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, r10 r10Var) {
        this.a = 1;
        this.e = h5Var;
        this.b = i7;
        this.c = context;
        this.d = h6Var;
        this.f = r10Var;
    }

    public /* synthetic */ l5(gs gsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = gsVar;
        this.f = obj;
        this.b = i7;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ l5(ld0 ld0Var, String str, String str2, String str3, int i7) {
        this.a = 4;
        this.e = ld0Var;
        this.f = str;
        this.c = str2;
        this.d = str3;
        this.b = i7;
    }
}
