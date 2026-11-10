package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gm extends vf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.z e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gm(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f = obj;
        this.e = zVar;
    }

    @Override // vf.b
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new oe(17, this, (org.telegram.ui.Cells.t0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // vf.b
    public final void d() {
        switch (this.d) {
            case 0:
                nm nmVar = (nm) this.f;
                cn cnVar = nmVar.a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.e;
                cnVar.Yb = q1Var.getMessageObject().e1();
                cn cnVar2 = nmVar.a;
                cnVar2.Zb = 2;
                cnVar2.ac = null;
                q1Var.invalidate();
                break;
            case 1:
                nm nmVar2 = (nm) this.f;
                cn cnVar3 = nmVar2.a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                cnVar3.Yb = q1Var2.getMessageObject().e1();
                cn cnVar4 = nmVar2.a;
                cnVar4.Zb = 2;
                cnVar4.ac = null;
                q1Var2.invalidate();
                break;
            case 2:
                nm nmVar3 = (nm) this.f;
                cn cnVar5 = nmVar3.a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.e;
                cnVar5.Yb = q1Var3.getMessageObject().e1();
                cn cnVar6 = nmVar3.a;
                cnVar6.Zb = 2;
                cnVar6.ac = null;
                q1Var3.invalidate();
                break;
            case 3:
                nm nmVar4 = (nm) this.f;
                cn cnVar7 = nmVar4.a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.e;
                cnVar7.Yb = q1Var4.getMessageObject().e1();
                cn cnVar8 = nmVar4.a;
                cnVar8.Zb = 2;
                cnVar8.ac = null;
                q1Var4.invalidate();
                break;
            case 4:
                nm nmVar5 = (nm) this.f;
                cn cnVar9 = nmVar5.a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.e;
                cnVar9.Yb = q1Var5.getMessageObject().e1();
                cn cnVar10 = nmVar5.a;
                cnVar10.Zb = 2;
                cnVar10.ac = null;
                q1Var5.invalidate();
                break;
            case 5:
                nm nmVar6 = (nm) this.f;
                cn cnVar11 = nmVar6.a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.e;
                cnVar11.Yb = q1Var6.getMessageObject().e1();
                cn cnVar12 = nmVar6.a;
                cnVar12.Zb = 2;
                cnVar12.ac = null;
                q1Var6.invalidate();
                break;
            default:
                gl glVar = (gl) this.f;
                cn cnVar13 = glVar.a.Q;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.e;
                cnVar13.Yb = t0Var.getMessageObject().e1();
                cn cnVar14 = glVar.a.Q;
                cnVar14.Zb = 4;
                cnVar14.ac = null;
                t0Var.getMessageObject().r = true;
                t0Var.invalidate();
                break;
        }
    }
}
