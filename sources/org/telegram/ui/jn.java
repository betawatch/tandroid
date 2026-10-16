package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jn extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new jd(19, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // pf.c
    public final void d() {
        switch (this.d) {
            case 0:
                qn qnVar = (qn) this.f;
                fo foVar = qnVar.a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                foVar.wb = u1Var.getMessageObject().getId();
                fo foVar2 = qnVar.a;
                foVar2.xb = 2;
                foVar2.yb = null;
                u1Var.invalidate();
                break;
            case 1:
                qn qnVar2 = (qn) this.f;
                fo foVar3 = qnVar2.a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                foVar3.wb = u1Var2.getMessageObject().getId();
                fo foVar4 = qnVar2.a;
                foVar4.xb = 2;
                foVar4.yb = null;
                u1Var2.invalidate();
                break;
            case 2:
                qn qnVar3 = (qn) this.f;
                fo foVar5 = qnVar3.a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                foVar5.wb = u1Var3.getMessageObject().getId();
                fo foVar6 = qnVar3.a;
                foVar6.xb = 2;
                foVar6.yb = null;
                u1Var3.invalidate();
                break;
            case 3:
                qn qnVar4 = (qn) this.f;
                fo foVar7 = qnVar4.a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                foVar7.wb = u1Var4.getMessageObject().getId();
                fo foVar8 = qnVar4.a;
                foVar8.xb = 2;
                foVar8.yb = null;
                u1Var4.invalidate();
                break;
            case 4:
                qn qnVar5 = (qn) this.f;
                fo foVar9 = qnVar5.a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                foVar9.wb = u1Var5.getMessageObject().getId();
                fo foVar10 = qnVar5.a;
                foVar10.xb = 2;
                foVar10.yb = null;
                u1Var5.invalidate();
                break;
            case 5:
                qn qnVar6 = (qn) this.f;
                fo foVar11 = qnVar6.a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                foVar11.wb = u1Var6.getMessageObject().getId();
                fo foVar12 = qnVar6.a;
                foVar12.xb = 2;
                foVar12.yb = null;
                u1Var6.invalidate();
                break;
            default:
                im imVar = (im) this.f;
                fo foVar13 = imVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                foVar13.wb = w0Var.getMessageObject().getId();
                fo foVar14 = imVar.a.Q;
                foVar14.xb = 4;
                foVar14.yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
