package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class en extends ze.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ en(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // ze.c
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new hc(22, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // ze.c
    public final void d() {
        switch (this.d) {
            case 0:
                ln lnVar = (ln) this.f;
                zn znVar = lnVar.a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                znVar.tb = s1Var.getMessageObject().getId();
                zn znVar2 = lnVar.a;
                znVar2.ub = 2;
                znVar2.vb = null;
                s1Var.invalidate();
                break;
            case 1:
                ln lnVar2 = (ln) this.f;
                zn znVar3 = lnVar2.a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.e;
                znVar3.tb = s1Var2.getMessageObject().getId();
                zn znVar4 = lnVar2.a;
                znVar4.ub = 2;
                znVar4.vb = null;
                s1Var2.invalidate();
                break;
            case 2:
                ln lnVar3 = (ln) this.f;
                zn znVar5 = lnVar3.a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.e;
                znVar5.tb = s1Var3.getMessageObject().getId();
                zn znVar6 = lnVar3.a;
                znVar6.ub = 2;
                znVar6.vb = null;
                s1Var3.invalidate();
                break;
            case 3:
                ln lnVar4 = (ln) this.f;
                zn znVar7 = lnVar4.a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.e;
                znVar7.tb = s1Var4.getMessageObject().getId();
                zn znVar8 = lnVar4.a;
                znVar8.ub = 2;
                znVar8.vb = null;
                s1Var4.invalidate();
                break;
            case 4:
                ln lnVar5 = (ln) this.f;
                zn znVar9 = lnVar5.a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.e;
                znVar9.tb = s1Var5.getMessageObject().getId();
                zn znVar10 = lnVar5.a;
                znVar10.ub = 2;
                znVar10.vb = null;
                s1Var5.invalidate();
                break;
            case 5:
                ln lnVar6 = (ln) this.f;
                zn znVar11 = lnVar6.a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.e;
                znVar11.tb = s1Var6.getMessageObject().getId();
                zn znVar12 = lnVar6.a;
                znVar12.ub = 2;
                znVar12.vb = null;
                s1Var6.invalidate();
                break;
            default:
                dm dmVar = (dm) this.f;
                zn znVar13 = dmVar.a.N;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                znVar13.tb = v0Var.getMessageObject().getId();
                zn znVar14 = dmVar.a.N;
                znVar14.ub = 4;
                znVar14.vb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                break;
        }
    }
}
