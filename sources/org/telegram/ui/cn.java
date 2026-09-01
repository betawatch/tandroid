package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cn extends af.f {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // af.f
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new fc(22, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // af.f
    public final void d() {
        switch (this.d) {
            case 0:
                jn jnVar = (jn) this.f;
                xn xnVar = jnVar.a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                xnVar.tb = t1Var.getMessageObject().getId();
                xn xnVar2 = jnVar.a;
                xnVar2.ub = 2;
                xnVar2.vb = null;
                t1Var.invalidate();
                break;
            case 1:
                jn jnVar2 = (jn) this.f;
                xn xnVar3 = jnVar2.a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                xnVar3.tb = t1Var2.getMessageObject().getId();
                xn xnVar4 = jnVar2.a;
                xnVar4.ub = 2;
                xnVar4.vb = null;
                t1Var2.invalidate();
                break;
            case 2:
                jn jnVar3 = (jn) this.f;
                xn xnVar5 = jnVar3.a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                xnVar5.tb = t1Var3.getMessageObject().getId();
                xn xnVar6 = jnVar3.a;
                xnVar6.ub = 2;
                xnVar6.vb = null;
                t1Var3.invalidate();
                break;
            case 3:
                jn jnVar4 = (jn) this.f;
                xn xnVar7 = jnVar4.a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                xnVar7.tb = t1Var4.getMessageObject().getId();
                xn xnVar8 = jnVar4.a;
                xnVar8.ub = 2;
                xnVar8.vb = null;
                t1Var4.invalidate();
                break;
            case 4:
                jn jnVar5 = (jn) this.f;
                xn xnVar9 = jnVar5.a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                xnVar9.tb = t1Var5.getMessageObject().getId();
                xn xnVar10 = jnVar5.a;
                xnVar10.ub = 2;
                xnVar10.vb = null;
                t1Var5.invalidate();
                break;
            case 5:
                jn jnVar6 = (jn) this.f;
                xn xnVar11 = jnVar6.a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                xnVar11.tb = t1Var6.getMessageObject().getId();
                xn xnVar12 = jnVar6.a;
                xnVar12.ub = 2;
                xnVar12.vb = null;
                t1Var6.invalidate();
                break;
            default:
                bm bmVar = (bm) this.f;
                xn xnVar13 = bmVar.a.N;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                xnVar13.tb = v0Var.getMessageObject().getId();
                xn xnVar14 = bmVar.a.N;
                xnVar14.ub = 4;
                xnVar14.vb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                break;
        }
    }
}
