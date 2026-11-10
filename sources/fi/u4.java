package fi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.fq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u4 implements d20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u4(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.d20
    public final Object a(Object obj) {
        int i7 = this.a;
        final int i10 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i11 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        switch (i7) {
            case 0:
                o5 o5Var = (o5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                c5 c5Var = (c5) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = c5Var.c;
                Integer num = (Integer) obj;
                j5 j5Var = o5Var.A0;
                g5 g5Var = o5Var.p1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    o5Var.I0(null, new ai.e(o5Var, 19));
                    return Boolean.TRUE;
                }
                int i12 = 3;
                int i13 = 2;
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.ia.c(R.raw.permission_request_location, 2131747302, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new bi.b9(i12, new bi.b9(i13, new ai.f1(10, o5Var, c5Var), c12 == true ? 1 : 0), c11 == true ? 1 : 0));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    c5Var.dismiss();
                    va vaVar = ((x9) o5Var).j2;
                    vaVar.c1.L.b(true);
                    vaVar.v();
                    vaVar.s(true);
                    vaVar.e(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    w6 w6Var = new w6(o5Var.getContext(), false, null, new ai.i(o5Var, 23), new di.b());
                    w6Var.n(new m4(o5Var, i13));
                    w6Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    o5Var.U1 = true;
                    o5Var.b0(o5Var.i0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!p10.i(o5Var.o1).q()) {
                    try {
                        m2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new gc(m2Var, g5Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(id.M0(2131744635, null), new m4(o5Var, c10 == true ? 1 : 0))).k(true);
                    return Boolean.FALSE;
                }
                int i14 = 0;
                for (int i15 = 0; i15 < j5Var.getChildCount(); i15++) {
                    if (j5Var.getChildAt(i15) instanceof tg.k0) {
                        i14++;
                    }
                }
                if (i14 >= 3) {
                    new gc(m2Var, g5Var).I(R.raw.linkbroken, id.M0(2131744638, null), id.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                o5Var.H0(null);
                c5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) obj4;
                final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = d0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                k60 F = k60.F(f0Var.c, h6Var, d0Var);
                F.W(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var)));
                F.l(R.drawable.msg_edit, id.M0(2131754996, null), new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16 = i10;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        f0 f0Var2 = f0Var;
                        switch (i16) {
                            case 0:
                                z zVar = new z(f0Var2.getContext(), h6Var2);
                                zVar.e2 = tL_aiComposeTone2;
                                zVar.c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                zVar.f1();
                                zVar.V1.setText(zVar.e2.title);
                                zVar.W1.setText(zVar.e2.prompt);
                                zVar.Y1.a(zVar.e2.author_id != 0, false);
                                zVar.o1.setTitle(org.telegram.messenger.id.M0(2131754996, null));
                                zVar.b2.setText(org.telegram.messenger.id.M0(2131754979, null));
                                zVar.e1();
                                zVar.i2.O(false);
                                zVar.g2 = new f(f0Var2, 2);
                                zVar.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f0Var2.getContext(), h6Var2);
                                String M0 = org.telegram.messenger.id.M0(2131754998, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ni.c(22, f0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                F.c(R.drawable.msg_share, id.M0(2131754983, null), new org.telegram.ui.m6(f0Var, tL_aiComposeTone, context, h6Var, 14), false);
                F.m(R.drawable.msg_delete, new fq(i11, f0Var, tL_aiComposeTone), id.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                boolean z9 = tL_aiComposeTone.creator;
                String M0 = id.M0(2131754998, null);
                final char c14 = c13 == true ? 1 : 0;
                F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.Components.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16 = c14;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        f0 f0Var2 = f0Var;
                        switch (i16) {
                            case 0:
                                z zVar = new z(f0Var2.getContext(), h6Var2);
                                zVar.e2 = tL_aiComposeTone2;
                                zVar.c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                zVar.f1();
                                zVar.V1.setText(zVar.e2.title);
                                zVar.W1.setText(zVar.e2.prompt);
                                zVar.Y1.a(zVar.e2.author_id != 0, false);
                                zVar.o1.setTitle(org.telegram.messenger.id.M0(2131754996, null));
                                zVar.b2.setText(org.telegram.messenger.id.M0(2131754979, null));
                                zVar.e1();
                                zVar.i2.O(false);
                                zVar.g2 = new f(f0Var2, 2);
                                zVar.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f0Var2.getContext(), h6Var2);
                                String M02 = org.telegram.messenger.id.M0(2131754998, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M02;
                                u1Var.T = org.telegram.messenger.id.M0(2131754997, null);
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ni.c(22, f0Var2, tL_aiComposeTone2));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, M0, z9, true);
                F.Z();
                return Boolean.TRUE;
            case 2:
                View view = (View) obj;
                ij ijVar = ((th.g) obj2).b;
                return th.c.d(view, (String) obj4, (String) obj3, ijVar.F0(), ijVar);
            default:
                pj0 pj0Var = (pj0) obj4;
                d20 d20Var = (d20) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != pj0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) d20Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    v4.d1 T = pj0Var.T(view2);
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
