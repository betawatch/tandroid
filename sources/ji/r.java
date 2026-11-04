package ji;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.lo;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ r(b0 b0Var, int i3) {
        this.a = i3;
        this.b = b0Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        ArrayList arrayList;
        int i3 = this.a;
        boolean z11 = true;
        int i10 = 2;
        int i11 = 0;
        b0 b0Var = this.b;
        switch (i3) {
            case 0:
                b0Var.J0((ArrayList) obj, true);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    b0Var.getClass();
                    break;
                } else {
                    f1.v((FrameLayout) b0Var.b, b0Var.J0, tL_error, false);
                    break;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                b0Var.p1.setLoading(false);
                if (tL_error2 == null) {
                    if (arrayList2 != null) {
                        b0Var.I1 = arrayList2;
                        if (!arrayList2.isEmpty()) {
                            b0Var.u1.d.g3.O(false);
                            b0Var.l1.D(2);
                            break;
                        } else {
                            k5.o(null, 2131751905, new fc((FrameLayout) b0Var.b, b0Var.J0), R.raw.info, 36);
                            break;
                        }
                    }
                } else {
                    f1.v((FrameLayout) b0Var.b, b0Var.J0, tL_error2, false);
                    break;
                }
                break;
            case 3:
                int i12 = b0.N1;
                b0Var.J0((ArrayList) obj, false);
                break;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                int i13 = b0.N1;
                arrayList3.add(r31.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.q.y * 0.25f))));
                arrayList3.add(r31.E(0, org.telegram.messenger.g0.L(56.0f)));
                String M0 = bd.M0(2131751849, null);
                r31 r31Var = new r31(39);
                r31Var.d = 101;
                r31Var.l = M0;
                r31Var.z = 0;
                r31Var.L(b0Var.o1);
                arrayList3.add(r31Var);
                arrayList3.add(r31.B(2, bd.M0(2131751848, null)));
                i0 i0Var = b0Var.E1;
                if (i0Var.n && i0Var.l == 1 && (arrayList = i0Var.j) != null && arrayList.size() == 1) {
                    arrayList3.add(r31.t(3, bd.M0(2131751904, null)));
                    i0Var.c(arrayList3);
                    arrayList3.add(r31.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i14 = i0Var.l;
                    if (i14 > 0) {
                        int i15 = i0Var.p;
                        String M02 = i14 == i15 ? bd.M0(2131751895, null) : bd.G(i14, "CommunityPendingRequestsRow", new Object[0]);
                        String num = i15 > 0 ? Integer.toString(i15) : null;
                        int i16 = ki.i.b;
                        r31 K = r31.K(ki.i.class);
                        K.d = 100;
                        K.k = R.drawable.filled_requests_24;
                        K.l = M02;
                        K.n = num;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.q = true;
                        arrayList3.add(K);
                        arrayList3.add(r31.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ui.f x10 = hp.s1(b0Var.a).x(b0Var.m1);
                ArrayList arrayList4 = (ArrayList) x10.e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.c;
                ArrayList arrayList7 = (ArrayList) x10.b;
                if (arrayList7.isEmpty()) {
                    z10 = false;
                } else {
                    arrayList3.add(r31.t(21, bd.M0(2131751878, null)));
                    int size = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList7.get(i17);
                        i17++;
                        arrayList3.add(f0.i((lo) obj3, b0Var));
                    }
                    z10 = true;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(r31.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(r31.t(23, bd.M0(2131751875, null)));
                    int size2 = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList6.get(i18);
                        i18++;
                        arrayList3.add(f0.i((lo) obj4, b0Var));
                    }
                    z10 = true;
                }
                if (arrayList5.isEmpty()) {
                    z11 = z10;
                } else {
                    if (z10) {
                        arrayList3.add(r31.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(r31.t(25, bd.M0(2131751876, null)));
                    int size3 = arrayList5.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj5 = arrayList5.get(i19);
                        i19++;
                        arrayList3.add(f0.i((lo) obj5, b0Var));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(r31.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(r31.t(27, bd.M0(2131751873, null)));
                    int size4 = arrayList4.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        arrayList3.add(f0.i((lo) obj6, b0Var));
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                i0 i0Var2 = b0Var.E1;
                arrayList8.add(r31.E(99, (int) (org.telegram.messenger.g0.q.y * 0.35f)));
                arrayList8.add(r31.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (t3.w(2, b0Var.n1)) {
                    arrayList8.add(r31.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131751894, null), new t(b0Var, i10)), true)));
                } else {
                    arrayList8.add(r31.B(1, bd.M0(2131751893, null)));
                }
                arrayList8.add(r31.j(2, b0Var.D1));
                arrayList8.add(r31.t(3, bd.G(i0Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                i0Var2.c(arrayList8);
                break;
        }
    }
}
