package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class in extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ in(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qh(8, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                pn pnVar = (pn) this.f;
                eo eoVar = pnVar.a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                eoVar.wb = t1Var.getMessageObject().getId();
                eo eoVar2 = pnVar.a;
                eoVar2.xb = 2;
                eoVar2.yb = null;
                t1Var.invalidate();
                break;
            case 1:
                pn pnVar2 = (pn) this.f;
                eo eoVar3 = pnVar2.a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                eoVar3.wb = t1Var2.getMessageObject().getId();
                eo eoVar4 = pnVar2.a;
                eoVar4.xb = 2;
                eoVar4.yb = null;
                t1Var2.invalidate();
                break;
            case 2:
                pn pnVar3 = (pn) this.f;
                eo eoVar5 = pnVar3.a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                eoVar5.wb = t1Var3.getMessageObject().getId();
                eo eoVar6 = pnVar3.a;
                eoVar6.xb = 2;
                eoVar6.yb = null;
                t1Var3.invalidate();
                break;
            case 3:
                pn pnVar4 = (pn) this.f;
                eo eoVar7 = pnVar4.a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                eoVar7.wb = t1Var4.getMessageObject().getId();
                eo eoVar8 = pnVar4.a;
                eoVar8.xb = 2;
                eoVar8.yb = null;
                t1Var4.invalidate();
                break;
            case 4:
                pn pnVar5 = (pn) this.f;
                eo eoVar9 = pnVar5.a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                eoVar9.wb = t1Var5.getMessageObject().getId();
                eo eoVar10 = pnVar5.a;
                eoVar10.xb = 2;
                eoVar10.yb = null;
                t1Var5.invalidate();
                break;
            case 5:
                pn pnVar6 = (pn) this.f;
                eo eoVar11 = pnVar6.a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                eoVar11.wb = t1Var6.getMessageObject().getId();
                eo eoVar12 = pnVar6.a;
                eoVar12.xb = 2;
                eoVar12.yb = null;
                t1Var6.invalidate();
                break;
            default:
                gm gmVar = (gm) this.f;
                eo eoVar13 = gmVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                eoVar13.wb = w0Var.getMessageObject().getId();
                eo eoVar14 = gmVar.a.Q;
                eoVar14.xb = 4;
                eoVar14.yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
