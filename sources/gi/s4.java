package gi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import b8.nf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.v10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.lo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s4(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.v10
    public final Object a(Object obj) {
        int i3 = this.a;
        int i10 = 5;
        final int i11 = 0;
        final int i12 = 1;
        char c2 = 1;
        char c10 = 1;
        char c11 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                m5 m5Var = (m5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                a5 a5Var = (a5) obj2;
                org.telegram.ui.ActionBar.j2 j2Var = a5Var.c;
                Integer num = (Integer) obj;
                h5 h5Var = m5Var.B0;
                e5 e5Var = m5Var.q1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    m5Var.I0(null, new ai.c(m5Var, 29));
                    return Boolean.TRUE;
                }
                int i13 = 3;
                int i14 = 2;
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    nf.c(R.raw.permission_request_location, 2131747310, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ci.b8(i13, new ci.b8(i14, new ai.o1(14, m5Var, a5Var), c11 == true ? 1 : 0), c10 == true ? 1 : 0));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    a5Var.dismiss();
                    va vaVar = ((x9) m5Var).k2;
                    vaVar.d1.M.b(true);
                    vaVar.v();
                    vaVar.s(true);
                    vaVar.e(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    x6 x6Var = new x6(m5Var.getContext(), false, null, new ai.v2(m5Var, 26), new ei.b());
                    x6Var.n(new j4(m5Var, i14));
                    x6Var.show();
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
                if (!h10.i(m5Var.p1).q()) {
                    try {
                        j2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new fc(j2Var, e5Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(bd.M0(2131744645, null), new j4(m5Var, c2 == true ? 1 : 0))).k(true);
                    return Boolean.FALSE;
                }
                int i15 = 0;
                for (int i16 = 0; i16 < h5Var.getChildCount(); i16++) {
                    if (h5Var.getChildAt(i16) instanceof ug.j0) {
                        i15++;
                    }
                }
                if (i15 >= 3) {
                    new fc(j2Var, e5Var).I(R.raw.linkbroken, bd.M0(2131744648, null), bd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                m5Var.H0(null);
                a5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj4;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                f60 F = f60.F(e0Var.c, e6Var, c0Var);
                F.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var)));
                F.l(R.drawable.msg_edit, bd.M0(2131754996, null), new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i11;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        e0 e0Var2 = e0Var;
                        switch (i17) {
                            case 0:
                                z zVar = new z(e0Var2.getContext(), e6Var2);
                                zVar.c2 = tL_aiComposeTone2;
                                zVar.a2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                zVar.f1();
                                zVar.T1.setText(zVar.c2.title);
                                zVar.U1.setText(zVar.c2.prompt);
                                zVar.W1.a(zVar.c2.author_id != 0, false);
                                zVar.m1.setTitle(org.telegram.messenger.bd.M0(2131754996, null));
                                zVar.Z1.setText(org.telegram.messenger.bd.M0(2131754979, null));
                                zVar.e1();
                                zVar.g2.O(false);
                                zVar.e2 = new g(e0Var2, 2);
                                zVar.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e0Var2.getContext(), e6Var2);
                                String M0 = org.telegram.messenger.bd.M0(2131754998, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = org.telegram.messenger.bd.M0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.jo(2, e0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                F.c(R.drawable.msg_share, bd.M0(2131754983, null), new o4.b1(e0Var, tL_aiComposeTone, context, e6Var, 20), false);
                F.m(R.drawable.msg_delete, new lo(i10, e0Var, tL_aiComposeTone), bd.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i12;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        e0 e0Var2 = e0Var;
                        switch (i17) {
                            case 0:
                                z zVar = new z(e0Var2.getContext(), e6Var2);
                                zVar.c2 = tL_aiComposeTone2;
                                zVar.a2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                zVar.f1();
                                zVar.T1.setText(zVar.c2.title);
                                zVar.U1.setText(zVar.c2.prompt);
                                zVar.W1.a(zVar.c2.author_id != 0, false);
                                zVar.m1.setTitle(org.telegram.messenger.bd.M0(2131754996, null));
                                zVar.Z1.setText(org.telegram.messenger.bd.M0(2131754979, null));
                                zVar.e1();
                                zVar.g2.O(false);
                                zVar.e2 = new g(e0Var2, 2);
                                zVar.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e0Var2.getContext(), e6Var2);
                                String M0 = org.telegram.messenger.bd.M0(2131754998, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = org.telegram.messenger.bd.M0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.jo(2, e0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, bd.M0(2131754998, null), tL_aiComposeTone.creator, true);
                F.Z();
                return Boolean.TRUE;
            case 2:
                View view = (View) obj;
                zi ziVar = ((uh.g) obj2).b;
                return uh.c.d(view, (String) obj4, (String) obj3, ziVar.F0(), ziVar);
            default:
                tj0 tj0Var = (tj0) obj4;
                v10 v10Var = (v10) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != tj0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) v10Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    u4.d1 T = tj0Var.T(view2);
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
