package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                bc bcVar = (bc) this.b;
                if (bcVar.d == gVar) {
                    bcVar.d = null;
                    break;
                }
                break;
            case 1:
                oa oaVar = (oa) this.b;
                if (!z9) {
                    oaVar.run();
                    break;
                }
                break;
            case 2:
                hk hkVar = (hk) this.b;
                hkVar.l0 = null;
                hkVar.m0 = 1.0f;
                hkVar.m0();
                break;
            case 3:
                bn0 bn0Var = (bn0) this.b;
                bn0Var.q = false;
                bn0Var.dismiss();
                break;
            case 4:
                cn0 cn0Var = (cn0) this.b;
                cn0Var.s = false;
                cn0Var.r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == cn0Var.f) {
                    cn0Var.f = null;
                    break;
                }
                break;
            case 5:
                mo0 mo0Var = (mo0) this.b;
                mo0Var.z1.setVisibility(8);
                mo0Var.u2.setVisibility(8);
                ko0 ko0Var = mo0Var.G1;
                ko0Var.f = null;
                ko0Var.f();
                mo0Var.w2 = null;
                mo0Var.H2 = false;
                break;
            default:
                mo0 mo0Var2 = ((vn0) this.b).d;
                mo0Var2.A1.setVisibility(8);
                mo0Var2.B1.setVisibility(8);
                mo0Var2.t2.setVisibility(8);
                mo0Var2.w2 = null;
                break;
        }
    }
}
