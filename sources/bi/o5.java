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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ni;
import org.telegram.messenger.oi;
import org.telegram.messenger.p10;
import org.telegram.messenger.q10;
import org.telegram.messenger.yv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.dk0;
import org.telegram.ui.fk0;
import org.telegram.ui.ld0;
import org.telegram.ui.pn0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements q10, org.telegram.ui.ActionBar.q1, ob0, oi, org.telegram.messenger.q1, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o5(int i7, qb0 qb0Var, org.telegram.ui.Components.f4 f4Var, org.telegram.ui.Components.g4 g4Var, TextView textView) {
        this.a = 2;
        this.b = i7;
        this.e = qb0Var;
        this.f = f4Var;
        this.c = g4Var;
        this.d = textView;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new i5((ld0) this.e, (String) this.f, fVar, list, (String) this.c, (String) this.d, this.b));
    }

    @Override // org.telegram.messenger.oi
    public void c(String str, ArrayList arrayList) {
        zw0 zw0Var = (zw0) this.e;
        String str2 = (String) this.f;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.b != zw0Var.L) {
            return;
        }
        zw0Var.J = 1;
        zw0Var.K = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ni niVar = (ni) obj;
                if (!hashSet.contains(niVar.a)) {
                    hashSet.add(niVar.a);
                    arrayList2.add(niVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            zw0Var.x = null;
            zw0Var.y = true;
            zw0Var.f();
            return;
        }
        zw0Var.y = false;
        zw0Var.w = false;
        zw0Var.c();
        g3 g3Var = zw0Var.d;
        if (g3Var != null) {
            g3Var.setVisibility(0);
        }
        zw0Var.a0 = org.telegram.messenger.g0.L(10.0f);
        zw0Var.x = arrayList;
        zw0Var.b0 = 0;
        zw0Var.c0 = Integer.valueOf(str2.length());
        g3 g3Var2 = zw0Var.d;
        if (g3Var2 != null) {
            g3Var2.invalidate();
        }
        org.telegram.ui.l4 l4Var = zw0Var.f;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override // org.telegram.messenger.q10
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        fq0 fq0Var = (fq0) this.e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        di.n8 n8Var = fq0Var.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || fq0Var.P) {
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
        String r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(fq0Var.c));
        boolean h = n8Var.h();
        if (TextUtils.isEmpty(r10) && !h) {
            return Boolean.FALSE;
        }
        x60 I = x60.I(g2Var, view);
        I.X(new u5(fq0Var));
        I.l(R.drawable.menu_gift_add, gd.N0(2131750221, null), new h5(fq0Var, 2), h);
        I.l(R.drawable.msg_share, gd.N0(2131750217, null), new i5(fq0Var, i11, r10, tL_starGiftCollection, context, i6Var, g2Var, 0), !TextUtils.isEmpty(r10));
        I.l(R.drawable.msg_edit, gd.N0(2131750219, null), new a1.e(28, fq0Var, tL_starGiftCollection), h);
        I.l(R.drawable.tabs_reorder, gd.N0(2131750218, null), new h5(fq0Var, 1), h);
        I.m(R.drawable.msg_delete, new ai.e1(fq0Var, i7, tL_starGiftCollection, 2), gd.N0(2131750220, null), h, true);
        fq0Var.J = I;
        I.a0();
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                di.h5 h5Var = (di.h5) this.e;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                p10 p10Var = (p10) this.f;
                di.f5 f5Var = (di.f5) h5Var.q.get(h5Var.s);
                if (f5Var != null) {
                    cg.a aVar = f5Var.c;
                    di.y8 x10 = di.y8.x(this.b, h5Var.s);
                    cg.a m10 = x10.e ? cg.a.m(x10.p()) : null;
                    if (m10 != null && aVar.b > m10.b) {
                        cg.b bVar = h5Var.s;
                        if (bVar != cg.b.a) {
                            if (bVar == cg.b.b) {
                                new ii.s(context, i6Var, f5Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new fb(context, i6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        vf.b bVar2 = h5Var.n;
                        if (bVar2 != null) {
                            bVar2.a(false);
                            h5Var.n = null;
                        }
                        p10Var.a(f5Var, t1Var.h(i7, true, true));
                        break;
                    }
                }
                break;
            default:
                fk0 fk0Var = (fk0) this.e;
                fk0.e0(this.b, (String) this.d, (yv) this.f, (dk0) this.c, fk0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob0
    public void o(qb0 qb0Var, int i7) {
        qb0 qb0Var2 = (qb0) this.e;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f;
        org.telegram.ui.Components.g4 g4Var = (org.telegram.ui.Components.g4) this.c;
        TextView textView = (TextView) this.d;
        org.telegram.ui.Components.b5.g(null, null, 0L, this.b, 3, qb0Var2, f4Var, g4Var);
        org.telegram.ui.Components.b5.e(textView, qb0Var2, f4Var, g4Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.i2 i2Var = (tg.i2) this.e;
        Bitmap bitmap = (Bitmap) this.f;
        int i7 = this.b;
        pn0 pn0Var = (pn0) this.c;
        j5 j5Var = (j5) this.d;
        i2Var.y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && i2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new kp0(i2Var, bitmap, i7, pn0Var, 25), 2000L);
        } else {
            j5Var.a(new ArrayList());
        }
    }

    public /* synthetic */ o5(FrameLayout frameLayout, int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = frameLayout;
        this.b = i7;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ o5(di.h5 h5Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, p10 p10Var) {
        this.a = 1;
        this.e = h5Var;
        this.b = i7;
        this.c = context;
        this.d = i6Var;
        this.f = p10Var;
    }

    public /* synthetic */ o5(fs fsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = fsVar;
        this.f = obj;
        this.b = i7;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ o5(ld0 ld0Var, String str, String str2, String str3, int i7) {
        this.a = 4;
        this.e = ld0Var;
        this.f = str;
        this.c = str2;
        this.d = str3;
        this.b = i7;
    }
}
