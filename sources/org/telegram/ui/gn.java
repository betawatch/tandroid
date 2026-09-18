package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gn extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(5, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                nn nnVar = (nn) this.f;
                bo boVar = nnVar.a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                boVar.vb = t1Var.getMessageObject().getId();
                bo boVar2 = nnVar.a;
                boVar2.wb = 2;
                boVar2.xb = null;
                t1Var.invalidate();
                break;
            case 1:
                nn nnVar2 = (nn) this.f;
                bo boVar3 = nnVar2.a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                boVar3.vb = t1Var2.getMessageObject().getId();
                bo boVar4 = nnVar2.a;
                boVar4.wb = 2;
                boVar4.xb = null;
                t1Var2.invalidate();
                break;
            case 2:
                nn nnVar3 = (nn) this.f;
                bo boVar5 = nnVar3.a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                boVar5.vb = t1Var3.getMessageObject().getId();
                bo boVar6 = nnVar3.a;
                boVar6.wb = 2;
                boVar6.xb = null;
                t1Var3.invalidate();
                break;
            case 3:
                nn nnVar4 = (nn) this.f;
                bo boVar7 = nnVar4.a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                boVar7.vb = t1Var4.getMessageObject().getId();
                bo boVar8 = nnVar4.a;
                boVar8.wb = 2;
                boVar8.xb = null;
                t1Var4.invalidate();
                break;
            case 4:
                nn nnVar5 = (nn) this.f;
                bo boVar9 = nnVar5.a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                boVar9.vb = t1Var5.getMessageObject().getId();
                bo boVar10 = nnVar5.a;
                boVar10.wb = 2;
                boVar10.xb = null;
                t1Var5.invalidate();
                break;
            case 5:
                nn nnVar6 = (nn) this.f;
                bo boVar11 = nnVar6.a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                boVar11.vb = t1Var6.getMessageObject().getId();
                bo boVar12 = nnVar6.a;
                boVar12.wb = 2;
                boVar12.xb = null;
                t1Var6.invalidate();
                break;
            default:
                em emVar = (em) this.f;
                bo boVar13 = emVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                boVar13.vb = w0Var.getMessageObject().getId();
                bo boVar14 = emVar.a.Q;
                boVar14.wb = 4;
                boVar14.xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
