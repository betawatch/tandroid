package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bn extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new fh(10, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                in inVar = (in) this.f;
                wn wnVar = inVar.a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                wnVar.vb = u1Var.getMessageObject().getId();
                wn wnVar2 = inVar.a;
                wnVar2.wb = 2;
                wnVar2.xb = null;
                u1Var.invalidate();
                break;
            case 1:
                in inVar2 = (in) this.f;
                wn wnVar3 = inVar2.a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                wnVar3.vb = u1Var2.getMessageObject().getId();
                wn wnVar4 = inVar2.a;
                wnVar4.wb = 2;
                wnVar4.xb = null;
                u1Var2.invalidate();
                break;
            case 2:
                in inVar3 = (in) this.f;
                wn wnVar5 = inVar3.a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                wnVar5.vb = u1Var3.getMessageObject().getId();
                wn wnVar6 = inVar3.a;
                wnVar6.wb = 2;
                wnVar6.xb = null;
                u1Var3.invalidate();
                break;
            case 3:
                in inVar4 = (in) this.f;
                wn wnVar7 = inVar4.a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                wnVar7.vb = u1Var4.getMessageObject().getId();
                wn wnVar8 = inVar4.a;
                wnVar8.wb = 2;
                wnVar8.xb = null;
                u1Var4.invalidate();
                break;
            case 4:
                in inVar5 = (in) this.f;
                wn wnVar9 = inVar5.a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                wnVar9.vb = u1Var5.getMessageObject().getId();
                wn wnVar10 = inVar5.a;
                wnVar10.wb = 2;
                wnVar10.xb = null;
                u1Var5.invalidate();
                break;
            case 5:
                in inVar6 = (in) this.f;
                wn wnVar11 = inVar6.a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                wnVar11.vb = u1Var6.getMessageObject().getId();
                wn wnVar12 = inVar6.a;
                wnVar12.wb = 2;
                wnVar12.xb = null;
                u1Var6.invalidate();
                break;
            default:
                am amVar = (am) this.f;
                wn wnVar13 = amVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                wnVar13.vb = w0Var.getMessageObject().getId();
                wn wnVar14 = amVar.a.Q;
                wnVar14.wb = 4;
                wnVar14.xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
