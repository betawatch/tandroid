// default package

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo2 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xo2 b;

    public /* synthetic */ lo2(xo2 xo2Var, byte b) {
        this.a = b;
        this.b = xo2Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        boolean z2 = true;
        byte b2 = 2;
        int i = 0;
        xo2 xo2Var = this.b;
        switch (b) {
            case 0:
                xo2Var.F0((ArrayList) obj, true);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ik8.u((FrameLayout) xo2Var.b, xo2Var.J0, tL_error, false);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                xo2Var.r1.setLoading(false);
                if (tL_error2 == null) {
                    if (arrayList != null) {
                        xo2Var.K1 = arrayList;
                        if (!arrayList.isEmpty()) {
                            xo2Var.w1.d.g3.O(false);
                            xo2Var.n1.F(2);
                            break;
                        } else {
                            bs2.v(null, 2131751870, new d31((FrameLayout) xo2Var.b, xo2Var.J0), R.raw.info, 36);
                            break;
                        }
                    }
                } else {
                    ik8.u((FrameLayout) xo2Var.b, xo2Var.J0, tL_error2, false);
                    break;
                }
                break;
            case 3:
                int i2 = xo2.P1;
                xo2Var.F0((ArrayList) obj, false);
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj;
                int i3 = xo2.P1;
                arrayList2.add(b8c.E(99, Math.min(hl.L(176.0f) + hl.m, (int) (hl.q.y * 0.25f))));
                arrayList2.add(b8c.E(0, hl.L(56.0f)));
                String M0 = ob6.M0(2131751814, null);
                b8c b8cVar = new b8c(39);
                b8cVar.d = 101;
                b8cVar.m = M0;
                b8cVar.A = 0;
                b8cVar.L(xo2Var.q1);
                arrayList2.add(b8cVar);
                arrayList2.add(b8c.B(2, ob6.M0(2131751813, null)));
                fp2 fp2Var = xo2Var.G1;
                if (fp2Var.n && fp2Var.l == 1 && fp2Var.j.size() == 1) {
                    arrayList2.add(b8c.t(3, ob6.M0(2131751869, null)));
                    fp2Var.c(arrayList2);
                    arrayList2.add(b8c.E(5, hl.L(14.33f)));
                } else {
                    int i4 = fp2Var.l;
                    if (i4 > 0) {
                        int i5 = fp2Var.p;
                        String M02 = i4 == i5 ? ob6.M0(2131751860, null) : ob6.G(i4, "CommunityPendingRequestsRow", new Object[0]);
                        String num = i5 > 0 ? Integer.toString(i5) : null;
                        int i6 = jo2.b;
                        b8c K = b8c.K(jo2.class);
                        K.d = 100;
                        K.k = R.drawable.filled_requests_24;
                        K.m = M02;
                        K.o = num;
                        K.C = -66560164762966547L;
                        K.r = true;
                        arrayList2.add(K);
                        arrayList2.add(b8c.E(5, hl.L(14.33f)));
                    }
                }
                lyc v = uc7.s1(xo2Var.a).v(xo2Var.o1);
                ArrayList arrayList3 = (ArrayList) v.e;
                ArrayList arrayList4 = (ArrayList) v.d;
                ArrayList arrayList5 = (ArrayList) v.c;
                ArrayList arrayList6 = (ArrayList) v.b;
                if (arrayList6.isEmpty()) {
                    z = false;
                } else {
                    arrayList2.add(b8c.t(21, ob6.M0(2131751843, null)));
                    int size = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList6.get(i7);
                        i7++;
                        arrayList2.add(bp2.i((zb7) obj3, xo2Var));
                    }
                    z = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z) {
                        arrayList2.add(b8c.E(22, hl.L(12.0f)));
                    }
                    arrayList2.add(b8c.t(23, ob6.M0(2131751840, null)));
                    int size2 = arrayList5.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj4 = arrayList5.get(i8);
                        i8++;
                        arrayList2.add(bp2.i((zb7) obj4, xo2Var));
                    }
                    z = true;
                }
                if (arrayList4.isEmpty()) {
                    z2 = z;
                } else {
                    if (z) {
                        arrayList2.add(b8c.E(24, hl.L(12.0f)));
                    }
                    arrayList2.add(b8c.t(25, ob6.M0(2131751841, null)));
                    int size3 = arrayList4.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj5 = arrayList4.get(i9);
                        i9++;
                        arrayList2.add(bp2.i((zb7) obj5, xo2Var));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    if (z2) {
                        arrayList2.add(b8c.E(26, hl.L(12.0f)));
                    }
                    arrayList2.add(b8c.t(27, ob6.M0(2131751838, null)));
                    int size4 = arrayList3.size();
                    while (i < size4) {
                        Object obj6 = arrayList3.get(i);
                        i++;
                        arrayList2.add(bp2.i((zb7) obj6, xo2Var));
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList7 = (ArrayList) obj;
                int i10 = xo2.P1;
                fp2 fp2Var2 = xo2Var.G1;
                arrayList7.add(b8c.E(99, (int) (hl.q.y * 0.35f)));
                arrayList7.add(b8c.E(0, hl.L(48.0f)));
                if (xc2.w(2, xo2Var.p1)) {
                    arrayList7.add(b8c.B(1, hl.D2(hl.N2(ob6.M0(2131751859, null), -1, 0, new no2(xo2Var, b2), null), true)));
                } else {
                    arrayList7.add(b8c.B(1, ob6.M0(2131751858, null)));
                }
                arrayList7.add(b8c.j(2, xo2Var.F1));
                arrayList7.add(b8c.t(3, ob6.G(fp2Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                fp2Var2.c(arrayList7);
                break;
        }
    }
}
