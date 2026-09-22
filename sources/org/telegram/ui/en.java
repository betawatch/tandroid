package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class en extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ en(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((ln) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((ln) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((ln) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((ln) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((ln) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((ln) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gh(11, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                ln lnVar = (ln) this.f;
                zn znVar = lnVar.a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                znVar.vb = u1Var.getMessageObject().getId();
                zn znVar2 = lnVar.a;
                znVar2.wb = 2;
                znVar2.xb = null;
                u1Var.invalidate();
                break;
            case 1:
                ln lnVar2 = (ln) this.f;
                zn znVar3 = lnVar2.a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                znVar3.vb = u1Var2.getMessageObject().getId();
                zn znVar4 = lnVar2.a;
                znVar4.wb = 2;
                znVar4.xb = null;
                u1Var2.invalidate();
                break;
            case 2:
                ln lnVar3 = (ln) this.f;
                zn znVar5 = lnVar3.a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                znVar5.vb = u1Var3.getMessageObject().getId();
                zn znVar6 = lnVar3.a;
                znVar6.wb = 2;
                znVar6.xb = null;
                u1Var3.invalidate();
                break;
            case 3:
                ln lnVar4 = (ln) this.f;
                zn znVar7 = lnVar4.a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                znVar7.vb = u1Var4.getMessageObject().getId();
                zn znVar8 = lnVar4.a;
                znVar8.wb = 2;
                znVar8.xb = null;
                u1Var4.invalidate();
                break;
            case 4:
                ln lnVar5 = (ln) this.f;
                zn znVar9 = lnVar5.a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                znVar9.vb = u1Var5.getMessageObject().getId();
                zn znVar10 = lnVar5.a;
                znVar10.wb = 2;
                znVar10.xb = null;
                u1Var5.invalidate();
                break;
            case 5:
                ln lnVar6 = (ln) this.f;
                zn znVar11 = lnVar6.a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                znVar11.vb = u1Var6.getMessageObject().getId();
                zn znVar12 = lnVar6.a;
                znVar12.wb = 2;
                znVar12.xb = null;
                u1Var6.invalidate();
                break;
            default:
                cm cmVar = (cm) this.f;
                zn znVar13 = cmVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                znVar13.vb = w0Var.getMessageObject().getId();
                zn znVar14 = cmVar.a.Q;
                znVar14.wb = 4;
                znVar14.xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
