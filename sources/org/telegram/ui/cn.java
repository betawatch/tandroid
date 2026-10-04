package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class cn extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ug(((kn) this.f).a, 29), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f).a, 0), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f).a, 1), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f).a, 4), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oh(9, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                kn knVar = (kn) this.f;
                yn ynVar = knVar.a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                ynVar.tb = u1Var.getMessageObject().getId();
                yn ynVar2 = knVar.a;
                ynVar2.ub = 2;
                ynVar2.vb = null;
                u1Var.invalidate();
                break;
            case 1:
                kn knVar2 = (kn) this.f;
                yn ynVar3 = knVar2.a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                ynVar3.tb = u1Var2.getMessageObject().getId();
                yn ynVar4 = knVar2.a;
                ynVar4.ub = 2;
                ynVar4.vb = null;
                u1Var2.invalidate();
                break;
            case 2:
                kn knVar3 = (kn) this.f;
                yn ynVar5 = knVar3.a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                ynVar5.tb = u1Var3.getMessageObject().getId();
                yn ynVar6 = knVar3.a;
                ynVar6.ub = 2;
                ynVar6.vb = null;
                u1Var3.invalidate();
                break;
            case 3:
                kn knVar4 = (kn) this.f;
                yn ynVar7 = knVar4.a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                ynVar7.tb = u1Var4.getMessageObject().getId();
                yn ynVar8 = knVar4.a;
                ynVar8.ub = 2;
                ynVar8.vb = null;
                u1Var4.invalidate();
                break;
            case 4:
                kn knVar5 = (kn) this.f;
                yn ynVar9 = knVar5.a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                ynVar9.tb = u1Var5.getMessageObject().getId();
                yn ynVar10 = knVar5.a;
                ynVar10.ub = 2;
                ynVar10.vb = null;
                u1Var5.invalidate();
                break;
            case 5:
                kn knVar6 = (kn) this.f;
                yn ynVar11 = knVar6.a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                ynVar11.tb = u1Var6.getMessageObject().getId();
                yn ynVar12 = knVar6.a;
                ynVar12.ub = 2;
                ynVar12.vb = null;
                u1Var6.invalidate();
                break;
            default:
                am amVar = (am) this.f;
                yn ynVar13 = amVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                ynVar13.tb = w0Var.getMessageObject().getId();
                yn ynVar14 = amVar.a.Q;
                ynVar14.ub = 4;
                ynVar14.vb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
