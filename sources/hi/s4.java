package hi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.a20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.zg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s4(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.a20
    public final Object a(Object obj) {
        int i7 = this.a;
        final int i10 = 0;
        final int i11 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                m5 m5Var = (m5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                a5 a5Var = (a5) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = a5Var.c;
                Integer num = (Integer) obj;
                h5 h5Var = m5Var.B0;
                e5 e5Var = m5Var.q1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    m5Var.I0(null, new bi.b(m5Var, 29));
                    return Boolean.TRUE;
                }
                int i12 = 4;
                int i13 = 3;
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.ka.c(R.raw.permission_request_location, 2131747302, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.u2(i12, new ai.u2(i13, new ai.v1(15, m5Var, a5Var), c12 == true ? 1 : 0), c11 == true ? 1 : 0));
                    return Boolean.FALSE;
                }
                int i14 = 2;
                if (num.intValue() == 2) {
                    a5Var.dismiss();
                    sa saVar = ((u9) m5Var).k2;
                    saVar.d1.M.b(true);
                    saVar.v();
                    saVar.s(true);
                    saVar.e(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    v6 v6Var = new v6(m5Var.getContext(), false, null, new ai.g0(m5Var, 27), new fi.b());
                    v6Var.n(new j4(m5Var, i14));
                    v6Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    m5Var.V1 = true;
                    m5Var.b0(m5Var.i0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!m10.i(m5Var.p1).q()) {
                    try {
                        k2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new cc(k2Var, e5Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(hd.M0(2131744635, null), new j4(m5Var, c10 == true ? 1 : 0))).k(true);
                    return Boolean.FALSE;
                }
                int i15 = 0;
                for (int i16 = 0; i16 < h5Var.getChildCount(); i16++) {
                    if (h5Var.getChildAt(i16) instanceof tg.k0) {
                        i15++;
                    }
                }
                if (i15 >= 3) {
                    new cc(k2Var, e5Var).I(R.raw.linkbroken, hd.M0(2131744638, null), hd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                m5Var.H0(null);
                a5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj4;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.b0 b0Var = (org.telegram.ui.Components.b0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = b0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                m60 F = m60.F(d0Var.c, e6Var, b0Var);
                F.W(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var)));
                F.l(R.drawable.msg_edit, hd.M0(2131754996, null), new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i10;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        d0 d0Var2 = d0Var;
                        switch (i17) {
                            case 0:
                                y yVar = new y(d0Var2.getContext(), e6Var2);
                                yVar.f2 = tL_aiComposeTone2;
                                yVar.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                yVar.f1();
                                yVar.W1.setText(yVar.f2.title);
                                yVar.X1.setText(yVar.f2.prompt);
                                yVar.Z1.a(yVar.f2.author_id != 0, false);
                                yVar.p1.setTitle(org.telegram.messenger.hd.M0(2131754996, null));
                                yVar.c2.setText(org.telegram.messenger.hd.M0(2131754979, null));
                                yVar.e1();
                                yVar.j2.O(false);
                                yVar.h2 = new f(d0Var2, 2);
                                yVar.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d0Var2.getContext(), e6Var2);
                                String M0 = org.telegram.messenger.hd.M0(2131754998, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = org.telegram.messenger.hd.M0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new m2.d(26, d0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                F.c(R.drawable.msg_share, hd.M0(2131754983, null), new org.telegram.ui.ActionBar.l5(d0Var, tL_aiComposeTone, context, e6Var, 16), false);
                F.m(R.drawable.msg_delete, new zg(19, d0Var, tL_aiComposeTone), hd.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i11;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        d0 d0Var2 = d0Var;
                        switch (i17) {
                            case 0:
                                y yVar = new y(d0Var2.getContext(), e6Var2);
                                yVar.f2 = tL_aiComposeTone2;
                                yVar.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                yVar.f1();
                                yVar.W1.setText(yVar.f2.title);
                                yVar.X1.setText(yVar.f2.prompt);
                                yVar.Z1.a(yVar.f2.author_id != 0, false);
                                yVar.p1.setTitle(org.telegram.messenger.hd.M0(2131754996, null));
                                yVar.c2.setText(org.telegram.messenger.hd.M0(2131754979, null));
                                yVar.e1();
                                yVar.j2.O(false);
                                yVar.h2 = new f(d0Var2, 2);
                                yVar.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d0Var2.getContext(), e6Var2);
                                String M0 = org.telegram.messenger.hd.M0(2131754998, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = org.telegram.messenger.hd.M0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new m2.d(26, d0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, hd.M0(2131754998, null), tL_aiComposeTone.creator, true);
                F.Z();
                return Boolean.TRUE;
            case 2:
                View view = (View) obj;
                gj gjVar = ((th.g) obj2).b;
                return th.c.d(view, (String) obj4, (String) obj3, gjVar.F0(), gjVar);
            default:
                uj0 uj0Var = (uj0) obj4;
                a20 a20Var = (a20) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != uj0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) a20Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    v4.e1 T = uj0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
