// default package

import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iw0 implements ps3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ps3
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pn) obj).e();
                break;
            case 1:
                v21 v21Var = (v21) obj;
                if (v21Var.d == vpaVar) {
                    v21Var.d = null;
                    break;
                }
                break;
            case 2:
                k11 k11Var = (k11) obj;
                if (!z) {
                    k11Var.run();
                    break;
                }
                break;
            case 3:
                la1 la1Var = (la1) obj;
                vpa vpaVar2 = la1Var.E;
                if (vpaVar2 != null) {
                    vpaVar2.d();
                    la1Var.E = null;
                    break;
                }
                break;
            case 4:
                h42 h42Var = (h42) obj;
                h42Var.m0 = null;
                h42Var.n0 = 1.0f;
                h42Var.l0();
                break;
            case 5:
                km7 km7Var = (km7) obj;
                km7Var.a = f;
                lm7 lm7Var = km7Var.d;
                km7 km7Var2 = lm7Var.U;
                if (!lm7Var.h) {
                    lm7Var.y0();
                    if (!km7Var2.b()) {
                        Iterator it = lm7Var.V.values().iterator();
                        while (it.hasNext()) {
                            km7 km7Var3 = (km7) it.next();
                            if (km7Var3.b()) {
                                z2 = true;
                            } else if (km7Var3.b == km7Var2.b) {
                                it.remove();
                            }
                        }
                        Iterator it2 = lm7Var.W.values().iterator();
                        while (it2.hasNext()) {
                            z2 |= ((km7) it2.next()).b();
                        }
                        if (!z2) {
                            Arrays.fill(lm7Var.X, (Object) null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                w28 w28Var = (w28) obj;
                if (vpaVar == w28Var.c) {
                    w28Var.c = null;
                    break;
                }
                break;
            case 7:
                ((tc8) obj).E();
                break;
            case 8:
                b8a b8aVar = (b8a) obj;
                b8aVar.q = false;
                b8aVar.dismiss();
                break;
            case 9:
                c8a c8aVar = (c8a) obj;
                c8aVar.s = false;
                c8aVar.r = false;
                if (!z) {
                    vpaVar.d();
                }
                if (vpaVar == c8aVar.f) {
                    c8aVar.f = null;
                    break;
                }
                break;
            case 10:
                kea keaVar = (kea) obj;
                keaVar.z1.setVisibility(8);
                keaVar.u2.setVisibility(8);
                iea ieaVar = keaVar.G1;
                ieaVar.f = null;
                ieaVar.f();
                keaVar.w2 = null;
                keaVar.H2 = false;
                break;
            case 11:
                kea keaVar2 = ((tda) obj).d;
                keaVar2.A1.setVisibility(8);
                keaVar2.B1.setVisibility(8);
                keaVar2.t2.setVisibility(8);
                keaVar2.w2 = null;
                break;
            case 12:
                ((nea) obj).c.setTag(R.id.spring_tag, null);
                break;
            case 13:
                ((yrc) obj).f(z, f);
                break;
            default:
                euc eucVar = (euc) obj;
                eucVar.b0 = null;
                eucVar.c0 = 1.0f;
                eucVar.G0();
                break;
        }
    }
}
