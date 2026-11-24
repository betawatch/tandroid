// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hx0 implements ht3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hx0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ht3
    public final void a(zna znaVar, boolean z, float f, float f2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((po) obj).e();
                break;
            case 1:
                u31 u31Var = (u31) obj;
                if (u31Var.d == znaVar) {
                    u31Var.d = null;
                    break;
                }
                break;
            case 2:
                h21 h21Var = (h21) obj;
                if (!z) {
                    h21Var.run();
                    break;
                }
                break;
            case 3:
                lb1 lb1Var = (lb1) obj;
                zna znaVar2 = lb1Var.E;
                if (znaVar2 != null) {
                    znaVar2.d();
                    lb1Var.E = null;
                    break;
                }
                break;
            case 4:
                c52 c52Var = (c52) obj;
                c52Var.m0 = null;
                c52Var.n0 = 1.0f;
                c52Var.m0();
                break;
            case 5:
                t18 t18Var = (t18) obj;
                if (znaVar == t18Var.c) {
                    t18Var.c = null;
                    break;
                }
                break;
            case 6:
                ((eb8) obj).E();
                break;
            case 7:
                l6a l6aVar = (l6a) obj;
                l6aVar.q = false;
                l6aVar.dismiss();
                break;
            case 8:
                m6a m6aVar = (m6a) obj;
                m6aVar.s = false;
                m6aVar.r = false;
                if (!z) {
                    znaVar.d();
                }
                if (znaVar == m6aVar.f) {
                    m6aVar.f = null;
                    break;
                }
                break;
            case 9:
                tca tcaVar = (tca) obj;
                tcaVar.z1.setVisibility(8);
                tcaVar.u2.setVisibility(8);
                rca rcaVar = tcaVar.G1;
                rcaVar.f = null;
                rcaVar.f();
                tcaVar.w2 = null;
                tcaVar.H2 = false;
                break;
            case 10:
                tca tcaVar2 = ((cca) obj).d;
                tcaVar2.A1.setVisibility(8);
                tcaVar2.B1.setVisibility(8);
                tcaVar2.t2.setVisibility(8);
                tcaVar2.w2 = null;
                break;
            case 11:
                ((wca) obj).c.setTag(R.id.spring_tag, null);
                break;
            case 12:
                ((npc) obj).f(z, f);
                break;
            default:
                rrc rrcVar = (rrc) obj;
                rrcVar.b0 = null;
                rrcVar.c0 = 1.0f;
                rrcVar.G0();
                break;
        }
    }
}
