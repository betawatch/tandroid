package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.r20
    public final Object a(Object obj) {
        int i10 = this.a;
        final int i11 = 0;
        boolean z10 = true;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                final g0 g0Var = (g0) obj4;
                final org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                Context context = (Context) obj2;
                e0 e0Var = (e0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    z60 F = z60.F(g0Var.c, p6Var, e0Var);
                    F.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)));
                    F.l(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131754996, null), new Runnable() { // from class: org.telegram.ui.Components.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i11;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                            g0 g0Var2 = g0Var;
                            switch (i12) {
                                case 0:
                                    z zVar = new z(g0Var2.getContext(), p6Var2);
                                    zVar.b2 = tL_aiComposeTone2;
                                    zVar.Z1 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.f1();
                                    zVar.S1.setText(zVar.b2.title);
                                    zVar.T1.setText(zVar.b2.prompt);
                                    zVar.V1.a(zVar.b2.author_id != 0, false);
                                    zVar.l1.setTitle(org.telegram.messenger.cd.L0(2131754996, null));
                                    zVar.Y1.setText(org.telegram.messenger.cd.L0(2131754979, null));
                                    zVar.e1();
                                    zVar.f2.O(false);
                                    zVar.d2 = new f(g0Var2, 2);
                                    zVar.show();
                                    break;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var2.getContext(), p6Var2);
                                    String L0 = org.telegram.messenger.cd.L0(2131754998, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ng.d(22, g0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    break;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, org.telegram.messenger.cd.L0(2131754983, null), new org.telegram.ui.fp((Object) g0Var, (Object) tL_aiComposeTone, (Object) context, (Object) p6Var, 4), false);
                    F.m(R.drawable.msg_delete, new org.telegram.ui.zg(24, g0Var, tL_aiComposeTone), org.telegram.messenger.cd.L0(2131754985, null), !tL_aiComposeTone.creator, true);
                    boolean z11 = tL_aiComposeTone.creator;
                    String L0 = org.telegram.messenger.cd.L0(2131754998, null);
                    final char c13 = c10 == true ? 1 : 0;
                    F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.Components.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = c13;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                            g0 g0Var2 = g0Var;
                            switch (i12) {
                                case 0:
                                    z zVar = new z(g0Var2.getContext(), p6Var2);
                                    zVar.b2 = tL_aiComposeTone2;
                                    zVar.Z1 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.f1();
                                    zVar.S1.setText(zVar.b2.title);
                                    zVar.T1.setText(zVar.b2.prompt);
                                    zVar.V1.a(zVar.b2.author_id != 0, false);
                                    zVar.l1.setTitle(org.telegram.messenger.cd.L0(2131754996, null));
                                    zVar.Y1.setText(org.telegram.messenger.cd.L0(2131754979, null));
                                    zVar.e1();
                                    zVar.f2.O(false);
                                    zVar.d2 = new f(g0Var2, 2);
                                    zVar.show();
                                    break;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var2.getContext(), p6Var2);
                                    String L02 = org.telegram.messenger.cd.L0(2131754998, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ng.d(22, g0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    break;
                            }
                        }
                    }, L0, z11, true);
                    F.Z();
                    break;
                } else {
                    break;
                }
            case 1:
                View view = (View) obj;
                org.telegram.messenger.jj jjVar = ((jh.i) obj2).b;
                break;
            case 2:
                tk0 tk0Var = (tk0) obj4;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != tk0Var) {
                        break;
                    } else {
                        Boolean bool = (Boolean) r20Var.a(view2);
                        boolean booleanValue = bool.booleanValue();
                        s4.c1 T = tk0Var.T(view2);
                        if (T != null) {
                            sparseIntArray.put(T.f, booleanValue ? 1 : 0);
                        }
                        break;
                    }
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            default:
                vh.b4 b4Var = (vh.b4) obj4;
                boolean[] zArr = (boolean[]) obj3;
                vh.q3 q3Var = (vh.q3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = q3Var.c;
                Integer num = (Integer) obj;
                vh.x3 x3Var = b4Var.A0;
                org.telegram.ui.ActionBar.x4 x4Var = b4Var.p1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    b4Var.I0(null, new qh.d(b4Var, 19));
                    break;
                } else {
                    int i12 = 5;
                    if (num.intValue() == 5) {
                        zArr[0] = false;
                        w7.c6.c(R.raw.permission_request_location, 2131747318, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new org.telegram.ui.nc(10, new org.telegram.ui.nc(9, new rh.e3(i12, b4Var, q3Var), z10), c12 == true ? 1 : 0));
                        break;
                    } else {
                        int i13 = 2;
                        if (num.intValue() == 2) {
                            q3Var.dismiss();
                            vh.o8 o8Var = ((vh.s7) b4Var).j2;
                            o8Var.c1.L.b(true);
                            o8Var.v();
                            o8Var.s(true);
                            o8Var.e(true);
                            break;
                        } else if (num.intValue() == 1) {
                            zArr[0] = false;
                            vh.f5 f5Var = new vh.f5(b4Var.getContext(), false, null, new ph.h1(b4Var, 26), new th.b());
                            f5Var.o(new vh.h3(b4Var, i13));
                            f5Var.show();
                            break;
                        } else if (num.intValue() == 3) {
                            b4Var.U1 = true;
                            b4Var.b0(b4Var.i0(true));
                            break;
                        } else if (num.intValue() == 4) {
                            if (org.telegram.messenger.d20.i(b4Var.o1).q()) {
                                int i14 = 0;
                                for (int i15 = 0; i15 < x3Var.getChildCount(); i15++) {
                                    if (x3Var.getChildAt(i15) instanceof jg.v0) {
                                        i14++;
                                    }
                                }
                                if (i14 >= 3) {
                                    new cc(p2Var, x4Var).I(R.raw.linkbroken, org.telegram.messenger.cd.L0(2131744657, null), org.telegram.messenger.cd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                                    break;
                                } else {
                                    zArr[0] = false;
                                    b4Var.H0(null);
                                    q3Var.dismiss();
                                    break;
                                }
                            } else {
                                try {
                                    p2Var.performHapticFeedback(3);
                                } catch (Exception unused2) {
                                }
                                new cc(p2Var, x4Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131744654, null), new vh.h3(b4Var, c11 == true ? 1 : 0))).k(true);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
        }
        return Boolean.FALSE;
    }
}
