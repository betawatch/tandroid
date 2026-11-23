package li;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.ro;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ t(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        ArrayList arrayList;
        int i7 = this.a;
        boolean z11 = true;
        int i10 = 2;
        int i11 = 0;
        d0 d0Var = this.b;
        switch (i7) {
            case 0:
                d0Var.K0((ArrayList) obj, true);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    d0Var.getClass();
                    break;
                } else {
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.b, d0Var.J0, tL_error, false);
                    break;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d0Var.s1.setLoading(false);
                if (tL_error2 == null) {
                    if (arrayList2 != null) {
                        d0Var.L1 = arrayList2;
                        if (!arrayList2.isEmpty()) {
                            d0Var.x1.d.g3.O(false);
                            d0Var.o1.A(2);
                            break;
                        } else {
                            f3.n(null, 2131751893, new lc((FrameLayout) d0Var.b, d0Var.J0), R.raw.info, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.b, d0Var.J0, tL_error2, false);
                    break;
                }
                break;
            case 3:
                int i12 = d0.Q1;
                d0Var.K0((ArrayList) obj, false);
                break;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                int i13 = d0.Q1;
                arrayList3.add(o41.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.q.y * 0.25f))));
                arrayList3.add(o41.E(0, org.telegram.messenger.g0.L(56.0f)));
                String N0 = hd.N0(2131751837, null);
                o41 o41Var = new o41(39);
                o41Var.d = 101;
                o41Var.m = N0;
                o41Var.A = 0;
                o41Var.L(d0Var.r1);
                arrayList3.add(o41Var);
                arrayList3.add(o41.B(2, hd.N0(2131751836, null)));
                k0 k0Var = d0Var.H1;
                if (k0Var.n && k0Var.l == 1 && (arrayList = k0Var.j) != null && arrayList.size() == 1) {
                    arrayList3.add(o41.t(3, hd.N0(2131751892, null)));
                    k0Var.c(arrayList3);
                    arrayList3.add(o41.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i14 = k0Var.l;
                    if (i14 > 0) {
                        int i15 = k0Var.p;
                        String N02 = i14 == i15 ? hd.N0(2131751883, null) : hd.G(i14, "CommunityPendingRequestsRow", new Object[0]);
                        String num = i15 > 0 ? Integer.toString(i15) : null;
                        int i16 = mi.i.b;
                        o41 K = o41.K(mi.i.class);
                        K.d = 100;
                        K.k = R.drawable.filled_requests_24;
                        K.m = N02;
                        K.o = num;
                        K.C = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.r = true;
                        arrayList3.add(K);
                        arrayList3.add(o41.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ab.c0 x10 = np.u1(d0Var.a).x(d0Var.p1);
                ArrayList arrayList4 = (ArrayList) x10.e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.c;
                ArrayList arrayList7 = (ArrayList) x10.b;
                if (arrayList7.isEmpty()) {
                    z10 = false;
                } else {
                    arrayList3.add(o41.t(21, hd.N0(2131751866, null)));
                    int size = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList7.get(i17);
                        i17++;
                        arrayList3.add(h0.i((ro) obj3, d0Var));
                    }
                    z10 = true;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(o41.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(o41.t(23, hd.N0(2131751863, null)));
                    int size2 = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList6.get(i18);
                        i18++;
                        arrayList3.add(h0.i((ro) obj4, d0Var));
                    }
                    z10 = true;
                }
                if (arrayList5.isEmpty()) {
                    z11 = z10;
                } else {
                    if (z10) {
                        arrayList3.add(o41.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(o41.t(25, hd.N0(2131751864, null)));
                    int size3 = arrayList5.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj5 = arrayList5.get(i19);
                        i19++;
                        arrayList3.add(h0.i((ro) obj5, d0Var));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(o41.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(o41.t(27, hd.N0(2131751861, null)));
                    int size4 = arrayList4.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        arrayList3.add(h0.i((ro) obj6, d0Var));
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                k0 k0Var2 = d0Var.H1;
                arrayList8.add(o41.E(99, (int) (org.telegram.messenger.g0.q.y * 0.35f)));
                arrayList8.add(o41.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (v3.w(2, d0Var.q1)) {
                    arrayList8.add(o41.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(hd.N0(2131751882, null), new v(d0Var, i10)), true)));
                } else {
                    arrayList8.add(o41.B(1, hd.N0(2131751881, null)));
                }
                arrayList8.add(o41.j(2, d0Var.G1));
                arrayList8.add(o41.t(3, hd.G(k0Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                k0Var2.c(arrayList8);
                break;
        }
    }
}
