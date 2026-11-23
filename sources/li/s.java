package li;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.qo;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ s(c0 c0Var, int i7) {
        this.a = i7;
        this.b = c0Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        ArrayList arrayList;
        int i7 = this.a;
        boolean z11 = true;
        int i10 = 2;
        int i11 = 0;
        c0 c0Var = this.b;
        switch (i7) {
            case 0:
                c0Var.K0((ArrayList) obj, true);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    c0Var.getClass();
                    break;
                } else {
                    org.telegram.ui.Cells.c0.t((FrameLayout) c0Var.b, c0Var.J0, tL_error, false);
                    break;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c0Var.s1.setLoading(false);
                if (tL_error2 == null) {
                    if (arrayList2 != null) {
                        c0Var.L1 = arrayList2;
                        if (!arrayList2.isEmpty()) {
                            c0Var.x1.d.g3.O(false);
                            c0Var.o1.C(2);
                            break;
                        } else {
                            f3.n(null, 2131751893, new kc((FrameLayout) c0Var.b, c0Var.J0), R.raw.info, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.c0.t((FrameLayout) c0Var.b, c0Var.J0, tL_error2, false);
                    break;
                }
                break;
            case 3:
                int i12 = c0.Q1;
                c0Var.K0((ArrayList) obj, false);
                break;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                int i13 = c0.Q1;
                arrayList3.add(n41.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.q.y * 0.25f))));
                arrayList3.add(n41.E(0, org.telegram.messenger.g0.L(56.0f)));
                String N0 = gd.N0(2131751837, null);
                n41 n41Var = new n41(39);
                n41Var.d = 101;
                n41Var.m = N0;
                n41Var.A = 0;
                n41Var.L(c0Var.r1);
                arrayList3.add(n41Var);
                arrayList3.add(n41.B(2, gd.N0(2131751836, null)));
                j0 j0Var = c0Var.H1;
                if (j0Var.n && j0Var.l == 1 && (arrayList = j0Var.j) != null && arrayList.size() == 1) {
                    arrayList3.add(n41.t(3, gd.N0(2131751892, null)));
                    j0Var.c(arrayList3);
                    arrayList3.add(n41.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i14 = j0Var.l;
                    if (i14 > 0) {
                        int i15 = j0Var.p;
                        String N02 = i14 == i15 ? gd.N0(2131751883, null) : gd.G(i14, "CommunityPendingRequestsRow", new Object[0]);
                        String num = i15 > 0 ? Integer.toString(i15) : null;
                        int i16 = mi.i.b;
                        n41 K = n41.K(mi.i.class);
                        K.d = 100;
                        K.k = R.drawable.filled_requests_24;
                        K.m = N02;
                        K.o = num;
                        K.C = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.r = true;
                        arrayList3.add(K);
                        arrayList3.add(n41.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ab.c0 x10 = mp.u1(c0Var.a).x(c0Var.p1);
                ArrayList arrayList4 = (ArrayList) x10.e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.c;
                ArrayList arrayList7 = (ArrayList) x10.b;
                if (arrayList7.isEmpty()) {
                    z10 = false;
                } else {
                    arrayList3.add(n41.t(21, gd.N0(2131751866, null)));
                    int size = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList7.get(i17);
                        i17++;
                        arrayList3.add(g0.i((qo) obj3, c0Var));
                    }
                    z10 = true;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(n41.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(n41.t(23, gd.N0(2131751863, null)));
                    int size2 = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList6.get(i18);
                        i18++;
                        arrayList3.add(g0.i((qo) obj4, c0Var));
                    }
                    z10 = true;
                }
                if (arrayList5.isEmpty()) {
                    z11 = z10;
                } else {
                    if (z10) {
                        arrayList3.add(n41.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(n41.t(25, gd.N0(2131751864, null)));
                    int size3 = arrayList5.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj5 = arrayList5.get(i19);
                        i19++;
                        arrayList3.add(g0.i((qo) obj5, c0Var));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(n41.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(n41.t(27, gd.N0(2131751861, null)));
                    int size4 = arrayList4.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        arrayList3.add(g0.i((qo) obj6, c0Var));
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                j0 j0Var2 = c0Var.H1;
                arrayList8.add(n41.E(99, (int) (org.telegram.messenger.g0.q.y * 0.35f)));
                arrayList8.add(n41.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (v3.w(2, c0Var.q1)) {
                    arrayList8.add(n41.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131751882, null), new u(c0Var, i10)), true)));
                } else {
                    arrayList8.add(n41.B(1, gd.N0(2131751881, null)));
                }
                arrayList8.add(n41.j(2, c0Var.G1));
                arrayList8.add(n41.t(3, gd.G(j0Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                j0Var2.c(arrayList8);
                break;
        }
    }
}
