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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.eh;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        int i10 = 17;
        final int i11 = 0;
        final int i12 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                k5 k5Var = (k5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                y4 y4Var = (y4) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = y4Var.c;
                Integer num = (Integer) obj;
                f5 f5Var = k5Var.B0;
                c5 c5Var = k5Var.q1;
                int i13 = 28;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    k5Var.I0(null, new bi.b(k5Var, i13));
                    return Boolean.TRUE;
                }
                int i14 = 4;
                int i15 = 3;
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.na.c(R.raw.permission_request_location, 2131747108, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.w2(i14, new ai.w2(i15, new ai.x1(i10, k5Var, y4Var), c12 == true ? 1 : 0), c11 == true ? 1 : 0));
                    return Boolean.FALSE;
                }
                int i16 = 2;
                if (num.intValue() == 2) {
                    y4Var.dismiss();
                    sa saVar = ((u9) k5Var).k2;
                    saVar.d1.M.b(true);
                    saVar.v();
                    saVar.s(true);
                    saVar.e(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    u6 u6Var = new u6(k5Var.getContext(), false, null, new ai.h0(k5Var, i13), new fi.b());
                    u6Var.n(new h4(k5Var, i16));
                    u6Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    k5Var.V1 = true;
                    k5Var.b0(k5Var.i0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!j10.i(k5Var.p1).q()) {
                    try {
                        m2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new lc(m2Var, c5Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(gd.N0(2131744394, null), new h4(k5Var, c10 == true ? 1 : 0))).k(true);
                    return Boolean.FALSE;
                }
                int i17 = 0;
                for (int i18 = 0; i18 < f5Var.getChildCount(); i18++) {
                    if (f5Var.getChildAt(i18) instanceof tg.l0) {
                        i17++;
                    }
                }
                if (i17 >= 3) {
                    new lc(m2Var, c5Var).I(R.raw.linkbroken, gd.N0(2131744397, null), gd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                k5Var.H0(null);
                y4Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) obj4;
                final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.l0 l0Var = (org.telegram.ui.Components.l0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = l0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                a70 G = a70.G(n0Var.c, h6Var, l0Var);
                G.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var)));
                G.l(R.drawable.msg_edit, gd.N0(2131754996, null), new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i19 = i11;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        n0 n0Var2 = n0Var;
                        switch (i19) {
                            case 0:
                                i0 i0Var = new i0(n0Var2.getContext(), h6Var2);
                                i0Var.f2 = tL_aiComposeTone2;
                                i0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                i0Var.g1();
                                i0Var.W1.setText(i0Var.f2.title);
                                i0Var.X1.setText(i0Var.f2.prompt);
                                i0Var.Z1.a(i0Var.f2.author_id != 0, false);
                                i0Var.p1.setTitle(org.telegram.messenger.gd.N0(2131754996, null));
                                i0Var.c2.setText(org.telegram.messenger.gd.N0(2131754979, null));
                                i0Var.f1();
                                i0Var.j2.O(false);
                                i0Var.h2 = new f(n0Var2, 2);
                                i0Var.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n0Var2.getContext(), h6Var2);
                                String N0 = org.telegram.messenger.gd.N0(2131754998, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.gd.N0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi.f0(24, n0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                G.c(R.drawable.msg_share, gd.N0(2131754983, null), new org.telegram.messenger.camera.i(n0Var, tL_aiComposeTone, context, h6Var, 19), false);
                G.m(R.drawable.msg_delete, new eh(i10, n0Var, tL_aiComposeTone), gd.N0(2131754985, null), !tL_aiComposeTone.creator, true);
                G.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i19 = i12;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        n0 n0Var2 = n0Var;
                        switch (i19) {
                            case 0:
                                i0 i0Var = new i0(n0Var2.getContext(), h6Var2);
                                i0Var.f2 = tL_aiComposeTone2;
                                i0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                i0Var.g1();
                                i0Var.W1.setText(i0Var.f2.title);
                                i0Var.X1.setText(i0Var.f2.prompt);
                                i0Var.Z1.a(i0Var.f2.author_id != 0, false);
                                i0Var.p1.setTitle(org.telegram.messenger.gd.N0(2131754996, null));
                                i0Var.c2.setText(org.telegram.messenger.gd.N0(2131754979, null));
                                i0Var.f1();
                                i0Var.j2.O(false);
                                i0Var.h2 = new f(n0Var2, 2);
                                i0Var.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n0Var2.getContext(), h6Var2);
                                String N0 = org.telegram.messenger.gd.N0(2131754998, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = N0;
                                t1Var.U = org.telegram.messenger.gd.N0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi.f0(24, n0Var2, tL_aiComposeTone2));
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
                y10 y10Var = (y10) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != ek0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) y10Var.a(view2);
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
