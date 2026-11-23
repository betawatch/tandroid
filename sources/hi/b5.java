package hi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ah;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b5 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b5(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.x10
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
                v5 v5Var = (v5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                j5 j5Var = (j5) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = j5Var.c;
                Integer num = (Integer) obj;
                q5 q5Var = v5Var.B0;
                n5 n5Var = v5Var.q1;
                int i12 = 28;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    v5Var.L0(null, new bi.b(v5Var, i12));
                    return Boolean.TRUE;
                }
                int i13 = 4;
                int i14 = 3;
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.oa.c(R.raw.permission_request_location, 2131747108, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.o2(i13, new ai.o2(i14, new ai.s1(18, v5Var, j5Var), c12 == true ? 1 : 0), c11 == true ? 1 : 0));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 6) {
                    a0 a0Var = v5Var.U1;
                    if (a0Var != null) {
                        a0Var.a();
                    }
                    return Boolean.TRUE;
                }
                if (num.intValue() == 2) {
                    j5Var.dismiss();
                    nb nbVar = ((pa) v5Var).o2;
                    nbVar.d1.M.b(true);
                    nbVar.v();
                    nbVar.s(true);
                    nbVar.e(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    e7 e7Var = new e7(v5Var.getContext(), false, null, new ai.d0(v5Var, i12), new fi.b());
                    e7Var.n(new s4(v5Var, i14));
                    e7Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    v5Var.Z1 = true;
                    v5Var.c0(v5Var.k0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!i10.i(v5Var.p1).q()) {
                    try {
                        m2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new org.telegram.ui.Components.kc(m2Var, n5Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(gd.N0(2131744391, null), new s4(v5Var, c10 == true ? 1 : 0))).k(true);
                    return Boolean.FALSE;
                }
                int i15 = 0;
                for (int i16 = 0; i16 < q5Var.getChildCount(); i16++) {
                    if (q5Var.getChildAt(i16) instanceof tg.p0) {
                        i15++;
                    }
                }
                if (i15 >= 3) {
                    new org.telegram.ui.Components.kc(m2Var, n5Var).I(R.raw.linkbroken, gd.N0(2131744394, null), gd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                v5Var.K0(null);
                j5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) obj4;
                final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.k0 k0Var = (org.telegram.ui.Components.k0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = k0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                x60 G = x60.G(m0Var.c, i6Var, k0Var);
                G.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var)));
                G.l(R.drawable.msg_edit, gd.N0(2131754996, null), new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i10;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        m0 m0Var2 = m0Var;
                        switch (i17) {
                            case 0:
                                h0 h0Var = new h0(m0Var2.getContext(), i6Var2);
                                h0Var.f2 = tL_aiComposeTone2;
                                h0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                h0Var.g1();
                                h0Var.W1.setText(h0Var.f2.title);
                                h0Var.X1.setText(h0Var.f2.prompt);
                                h0Var.Z1.a(h0Var.f2.author_id != 0, false);
                                h0Var.p1.setTitle(org.telegram.messenger.gd.N0(2131754996, null));
                                h0Var.c2.setText(org.telegram.messenger.gd.N0(2131754979, null));
                                h0Var.f1();
                                h0Var.j2.O(false);
                                h0Var.h2 = new f(m0Var2, 2);
                                h0Var.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m0Var2.getContext(), i6Var2);
                                String N0 = org.telegram.messenger.gd.N0(2131754998, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.gd.N0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi.f0(24, m0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                G.c(R.drawable.msg_share, gd.N0(2131754983, null), new oi.h(m0Var, tL_aiComposeTone, context, i6Var, 20), false);
                G.m(R.drawable.msg_delete, new ah(19, m0Var, tL_aiComposeTone), gd.N0(2131754985, null), !tL_aiComposeTone.creator, true);
                G.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i11;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        m0 m0Var2 = m0Var;
                        switch (i17) {
                            case 0:
                                h0 h0Var = new h0(m0Var2.getContext(), i6Var2);
                                h0Var.f2 = tL_aiComposeTone2;
                                h0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                h0Var.g1();
                                h0Var.W1.setText(h0Var.f2.title);
                                h0Var.X1.setText(h0Var.f2.prompt);
                                h0Var.Z1.a(h0Var.f2.author_id != 0, false);
                                h0Var.p1.setTitle(org.telegram.messenger.gd.N0(2131754996, null));
                                h0Var.c2.setText(org.telegram.messenger.gd.N0(2131754979, null));
                                h0Var.f1();
                                h0Var.j2.O(false);
                                h0Var.h2 = new f(m0Var2, 2);
                                h0Var.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m0Var2.getContext(), i6Var2);
                                String N0 = org.telegram.messenger.gd.N0(2131754998, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.gd.N0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi.f0(24, m0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, gd.N0(2131754998, null), tL_aiComposeTone.creator, true);
                G.a0();
                return Boolean.TRUE;
            case 2:
                View view = (View) obj;
                fj fjVar = ((th.g) obj2).b;
                return th.c.d(view, (String) obj4, (String) obj3, fjVar.F0(), fjVar);
            default:
                ek0 ek0Var = (ek0) obj4;
                x10 x10Var = (x10) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != ek0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) x10Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    v4.f1 T = ek0Var.T(view2);
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
