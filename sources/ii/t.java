package ii;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.uo;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ t(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        boolean z9;
        ArrayList arrayList;
        int i7 = this.a;
        boolean z10 = true;
        int i10 = 2;
        int i11 = 0;
        d0 d0Var = this.b;
        switch (i7) {
            case 0:
                d0Var.J0((ArrayList) obj, true);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    d0Var.getClass();
                    break;
                } else {
                    f1.r((FrameLayout) d0Var.b, d0Var.I0, tL_error, false);
                    break;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d0Var.o1.setLoading(false);
                if (tL_error2 == null) {
                    if (arrayList2 != null) {
                        d0Var.H1 = arrayList2;
                        if (!arrayList2.isEmpty()) {
                            d0Var.t1.d.f3.O(false);
                            d0Var.k1.E(2);
                            break;
                        } else {
                            k5.o(null, 2131751905, new hc((FrameLayout) d0Var.b, d0Var.I0), R.raw.info, 36);
                            break;
                        }
                    }
                } else {
                    f1.r((FrameLayout) d0Var.b, d0Var.I0, tL_error2, false);
                    break;
                }
                break;
            case 3:
                int i12 = d0.M1;
                d0Var.J0((ArrayList) obj, false);
                break;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                int i13 = d0.M1;
                arrayList3.add(y31.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.q.y * 0.25f))));
                arrayList3.add(y31.E(0, org.telegram.messenger.g0.L(56.0f)));
                String M0 = id.M0(2131751849, null);
                y31 y31Var = new y31(39);
                y31Var.d = 101;
                y31Var.l = M0;
                y31Var.z = 0;
                y31Var.L(d0Var.n1);
                arrayList3.add(y31Var);
                arrayList3.add(y31.B(2, id.M0(2131751848, null)));
                l0 l0Var = d0Var.D1;
                if (l0Var.n && l0Var.l == 1 && (arrayList = l0Var.j) != null && arrayList.size() == 1) {
                    arrayList3.add(y31.t(3, id.M0(2131751904, null)));
                    l0Var.c(arrayList3);
                    arrayList3.add(y31.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i14 = l0Var.l;
                    if (i14 > 0) {
                        int i15 = l0Var.p;
                        String M02 = i14 == i15 ? id.M0(2131751895, null) : id.G(i14, "CommunityPendingRequestsRow", new Object[0]);
                        String num = i15 > 0 ? Integer.toString(i15) : null;
                        int i16 = ji.i.b;
                        y31 K = y31.K(ji.i.class);
                        K.d = 100;
                        K.k = R.drawable.filled_requests_24;
                        K.l = M02;
                        K.n = num;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.q = true;
                        arrayList3.add(K);
                        arrayList3.add(y31.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ui.e x10 = qp.s1(d0Var.a).x(d0Var.l1);
                ArrayList arrayList4 = (ArrayList) x10.e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.c;
                ArrayList arrayList7 = (ArrayList) x10.b;
                if (arrayList7.isEmpty()) {
                    z9 = false;
                } else {
                    arrayList3.add(y31.t(21, id.M0(2131751878, null)));
                    int size = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList7.get(i17);
                        i17++;
                        arrayList3.add(i0.i((uo) obj3, d0Var));
                    }
                    z9 = true;
                }
                if (!arrayList6.isEmpty()) {
                    if (z9) {
                        arrayList3.add(y31.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(y31.t(23, id.M0(2131751875, null)));
                    int size2 = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList6.get(i18);
                        i18++;
                        arrayList3.add(i0.i((uo) obj4, d0Var));
                    }
                    z9 = true;
                }
                if (arrayList5.isEmpty()) {
                    z10 = z9;
                } else {
                    if (z9) {
                        arrayList3.add(y31.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(y31.t(25, id.M0(2131751876, null)));
                    int size3 = arrayList5.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj5 = arrayList5.get(i19);
                        i19++;
                        arrayList3.add(i0.i((uo) obj5, d0Var));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    if (z10) {
                        arrayList3.add(y31.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(y31.t(27, id.M0(2131751873, null)));
                    int size4 = arrayList4.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        arrayList3.add(i0.i((uo) obj6, d0Var));
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                l0 l0Var2 = d0Var.D1;
                arrayList8.add(y31.E(99, (int) (org.telegram.messenger.g0.q.y * 0.35f)));
                arrayList8.add(y31.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (t3.w(2, d0Var.m1)) {
                    arrayList8.add(y31.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(id.M0(2131751894, null), new v(d0Var, i10)), true)));
                } else {
                    arrayList8.add(y31.B(1, id.M0(2131751893, null)));
                }
                arrayList8.add(y31.j(2, d0Var.C1));
                arrayList8.add(y31.t(3, id.G(l0Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                l0Var2.c(arrayList8);
                break;
        }
    }
}
