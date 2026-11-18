package hi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y60;
import org.telegram.ui.ci;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q4(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.y10
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
                l5 l5Var = (l5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                z4 z4Var = (z4) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = z4Var.c;
                Integer num = (Integer) obj;
                g5 g5Var = l5Var.B0;
                d5 d5Var = l5Var.q1;
                int i12 = 28;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    l5Var.I0(null, new bi.b(l5Var, i12));
                    return Boolean.TRUE;
                }
                int i13 = 4;
                int i14 = 3;
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.na.c(R.raw.permission_request_location, 2131747109, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.u2(i13, new ai.u2(i14, new ai.v1(17, l5Var, z4Var), c12 == true ? 1 : 0), c11 == true ? 1 : 0));
                    return Boolean.FALSE;
                }
                int i15 = 2;
                if (num.intValue() == 2) {
                    z4Var.dismiss();
                    ta taVar = ((v9) l5Var).k2;
                    taVar.d1.M.b(true);
                    taVar.v();
                    taVar.s(true);
                    taVar.e(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    v6 v6Var = new v6(l5Var.getContext(), false, null, new ai.g0(l5Var, i12), new fi.b());
                    v6Var.n(new i4(l5Var, i15));
                    v6Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    l5Var.V1 = true;
                    l5Var.b0(l5Var.i0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!j10.i(l5Var.p1).q()) {
                    try {
                        n2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new lc(n2Var, d5Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(gd.M0(2131744400, null), new i4(l5Var, c10 == true ? 1 : 0))).k(true);
                    return Boolean.FALSE;
                }
                int i16 = 0;
                for (int i17 = 0; i17 < g5Var.getChildCount(); i17++) {
                    if (g5Var.getChildAt(i17) instanceof tg.k0) {
                        i16++;
                    }
                }
                if (i16 >= 3) {
                    new lc(n2Var, d5Var).I(R.raw.linkbroken, gd.M0(2131744403, null), gd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                l5Var.H0(null);
                z4Var.dismiss();
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
                y60 G = y60.G(m0Var.c, i6Var, k0Var);
                G.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var)));
                G.l(R.drawable.msg_edit, gd.M0(2131754996, null), new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18 = i10;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        m0 m0Var2 = m0Var;
                        switch (i18) {
                            case 0:
                                h0 h0Var = new h0(m0Var2.getContext(), i6Var2);
                                h0Var.f2 = tL_aiComposeTone2;
                                h0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                h0Var.g1();
                                h0Var.W1.setText(h0Var.f2.title);
                                h0Var.X1.setText(h0Var.f2.prompt);
                                h0Var.Z1.a(h0Var.f2.author_id != 0, false);
                                h0Var.p1.setTitle(org.telegram.messenger.gd.M0(2131754996, null));
                                h0Var.c2.setText(org.telegram.messenger.gd.M0(2131754979, null));
                                h0Var.f1();
                                h0Var.j2.O(false);
                                h0Var.h2 = new f(m0Var2, 2);
                                h0Var.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m0Var2.getContext(), i6Var2);
                                String M0 = org.telegram.messenger.gd.M0(2131754998, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                u1Var.U = org.telegram.messenger.gd.M0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new oi.e0(24, m0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                G.c(R.drawable.msg_share, gd.M0(2131754983, null), new org.telegram.messenger.camera.i(m0Var, tL_aiComposeTone, context, i6Var, 19), false);
                G.m(R.drawable.msg_delete, new ci(15, m0Var, tL_aiComposeTone), gd.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                G.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18 = i11;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        m0 m0Var2 = m0Var;
                        switch (i18) {
                            case 0:
                                h0 h0Var = new h0(m0Var2.getContext(), i6Var2);
                                h0Var.f2 = tL_aiComposeTone2;
                                h0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                h0Var.g1();
                                h0Var.W1.setText(h0Var.f2.title);
                                h0Var.X1.setText(h0Var.f2.prompt);
                                h0Var.Z1.a(h0Var.f2.author_id != 0, false);
                                h0Var.p1.setTitle(org.telegram.messenger.gd.M0(2131754996, null));
                                h0Var.c2.setText(org.telegram.messenger.gd.M0(2131754979, null));
                                h0Var.f1();
                                h0Var.j2.O(false);
                                h0Var.h2 = new f(m0Var2, 2);
                                h0Var.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m0Var2.getContext(), i6Var2);
                                String M0 = org.telegram.messenger.gd.M0(2131754998, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M0;
                                u1Var.U = org.telegram.messenger.gd.M0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new oi.e0(24, m0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, gd.M0(2131754998, null), tL_aiComposeTone.creator, true);
                G.a0();
                return Boolean.TRUE;
            case 2:
                View view = (View) obj;
                fj fjVar = ((th.g) obj2).b;
                return th.c.d(view, (String) obj4, (String) obj3, fjVar.F0(), fjVar);
            default:
                ck0 ck0Var = (ck0) obj4;
                y10 y10Var = (y10) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != ck0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) y10Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    v4.f1 T = ck0Var.T(view2);
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
