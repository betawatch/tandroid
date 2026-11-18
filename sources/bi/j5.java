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
import org.telegram.messenger.q10;
import org.telegram.messenger.r10;
import org.telegram.messenger.yv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.fk0;
import org.telegram.ui.hk0;
import org.telegram.ui.ld0;
import org.telegram.ui.on0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements r10, org.telegram.ui.ActionBar.r1, qb0, oi, org.telegram.messenger.q1, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j5(int i7, sb0 sb0Var, org.telegram.ui.Components.f4 f4Var, org.telegram.ui.Components.g4 g4Var, TextView textView) {
        this.a = 2;
        this.b = i7;
        this.e = sb0Var;
        this.f = f4Var;
        this.c = g4Var;
        this.d = textView;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new d5((ld0) this.e, (String) this.f, fVar, list, (String) this.c, (String) this.d, this.b));
    }

    @Override // org.telegram.messenger.oi
    public void e(String str, ArrayList arrayList) {
        yw0 yw0Var = (yw0) this.e;
        String str2 = (String) this.f;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.b != yw0Var.L) {
            return;
        }
        yw0Var.J = 1;
        yw0Var.K = str2;
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
            yw0Var.x = null;
            yw0Var.y = true;
            yw0Var.f();
            return;
        }
        yw0Var.y = false;
        yw0Var.w = false;
        yw0Var.c();
        a3 a3Var = yw0Var.d;
        if (a3Var != null) {
            a3Var.setVisibility(0);
        }
        yw0Var.a0 = org.telegram.messenger.g0.L(10.0f);
        yw0Var.x = arrayList;
        yw0Var.b0 = 0;
        yw0Var.c0 = Integer.valueOf(str2.length());
        a3 a3Var2 = yw0Var.d;
        if (a3Var2 != null) {
            a3Var2.invalidate();
        }
        org.telegram.ui.l4 l4Var = yw0Var.f;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override // org.telegram.messenger.r10
    public Object g(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        eq0 eq0Var = (eq0) this.e;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        di.m8 m8Var = eq0Var.e;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || eq0Var.P) {
            return Boolean.FALSE;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= m8Var.d().size()) {
                i7 = -1;
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) m8Var.d().get(i10)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) m8Var.d().get(i10);
                i7 = i10;
                break;
            }
            i10++;
        }
        int i11 = this.b;
        String r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(eq0Var.c));
        boolean h = m8Var.h();
        if (TextUtils.isEmpty(r10) && !h) {
            return Boolean.FALSE;
        }
        y60 I = y60.I(h2Var, view);
        I.X(new p5(eq0Var));
        I.l(R.drawable.menu_gift_add, gd.M0(2131750222, null), new c5(eq0Var, 2), h);
        I.l(R.drawable.msg_share, gd.M0(2131750218, null), new d5(eq0Var, i11, r10, tL_starGiftCollection, context, i6Var, h2Var, 0), !TextUtils.isEmpty(r10));
        I.l(R.drawable.msg_edit, gd.M0(2131750220, null), new a1.e(26, eq0Var, tL_starGiftCollection), h);
        I.l(R.drawable.tabs_reorder, gd.M0(2131750219, null), new c5(eq0Var, 1), h);
        I.m(R.drawable.msg_delete, new ai.a1(eq0Var, i7, tL_starGiftCollection, 3), gd.M0(2131750221, null), h, true);
        eq0Var.J = I;
        I.a0();
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                di.h5 h5Var = (di.h5) this.e;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                q10 q10Var = (q10) this.f;
                di.f5 f5Var = (di.f5) h5Var.q.get(h5Var.s);
                if (f5Var != null) {
                    cg.a aVar = f5Var.c;
                    di.x8 x10 = di.x8.x(this.b, h5Var.s);
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
                        q10Var.a(f5Var, u1Var.h(i7, true, true));
                        break;
                    }
                }
                break;
            default:
                hk0 hk0Var = (hk0) this.e;
                hk0.e0(this.b, (String) this.d, (yv) this.f, (fk0) this.c, hk0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qb0
    public void n(sb0 sb0Var, int i7) {
        sb0 sb0Var2 = (sb0) this.e;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f;
        org.telegram.ui.Components.g4 g4Var = (org.telegram.ui.Components.g4) this.c;
        TextView textView = (TextView) this.d;
        org.telegram.ui.Components.b5.g(null, null, 0L, this.b, 3, sb0Var2, f4Var, g4Var);
        org.telegram.ui.Components.b5.e(textView, sb0Var2, f4Var, g4Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.e2 e2Var = (tg.e2) this.e;
        Bitmap bitmap = (Bitmap) this.f;
        int i7 = this.b;
        on0 on0Var = (on0) this.c;
        e5 e5Var = (e5) this.d;
        e2Var.y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && e2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new kp0(e2Var, bitmap, i7, on0Var, 24), 2000L);
        } else {
            e5Var.a(new ArrayList());
        }
    }

    public /* synthetic */ j5(FrameLayout frameLayout, int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = frameLayout;
        this.b = i7;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ j5(di.h5 h5Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, q10 q10Var) {
        this.a = 1;
        this.e = h5Var;
        this.b = i7;
        this.c = context;
        this.d = i6Var;
        this.f = q10Var;
    }

    public /* synthetic */ j5(fs fsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = fsVar;
        this.f = obj;
        this.b = i7;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ j5(ld0 ld0Var, String str, String str2, String str3, int i7) {
        this.a = 4;
        this.e = ld0Var;
        this.f = str;
        this.c = str2;
        this.d = str3;
        this.b = i7;
    }
}
