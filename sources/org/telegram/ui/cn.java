package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rh(5, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                jn jnVar = (jn) this.f;
                xn xnVar = jnVar.a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                xnVar.vb = t1Var.getMessageObject().getId();
                xn xnVar2 = jnVar.a;
                xnVar2.wb = 2;
                xnVar2.xb = null;
                t1Var.invalidate();
                break;
            case 1:
                jn jnVar2 = (jn) this.f;
                xn xnVar3 = jnVar2.a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                xnVar3.vb = t1Var2.getMessageObject().getId();
                xn xnVar4 = jnVar2.a;
                xnVar4.wb = 2;
                xnVar4.xb = null;
                t1Var2.invalidate();
                break;
            case 2:
                jn jnVar3 = (jn) this.f;
                xn xnVar5 = jnVar3.a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                xnVar5.vb = t1Var3.getMessageObject().getId();
                xn xnVar6 = jnVar3.a;
                xnVar6.wb = 2;
                xnVar6.xb = null;
                t1Var3.invalidate();
                break;
            case 3:
                jn jnVar4 = (jn) this.f;
                xn xnVar7 = jnVar4.a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                xnVar7.vb = t1Var4.getMessageObject().getId();
                xn xnVar8 = jnVar4.a;
                xnVar8.wb = 2;
                xnVar8.xb = null;
                t1Var4.invalidate();
                break;
            case 4:
                jn jnVar5 = (jn) this.f;
                xn xnVar9 = jnVar5.a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                xnVar9.vb = t1Var5.getMessageObject().getId();
                xn xnVar10 = jnVar5.a;
                xnVar10.wb = 2;
                xnVar10.xb = null;
                t1Var5.invalidate();
                break;
            case 5:
                jn jnVar6 = (jn) this.f;
                xn xnVar11 = jnVar6.a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                xnVar11.vb = t1Var6.getMessageObject().getId();
                xn xnVar12 = jnVar6.a;
                xnVar12.wb = 2;
                xnVar12.xb = null;
                t1Var6.invalidate();
                break;
            default:
                bm bmVar = (bm) this.f;
                xn xnVar13 = bmVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                xnVar13.vb = w0Var.getMessageObject().getId();
                xn xnVar14 = bmVar.a.Q;
                xnVar14.wb = 4;
                xnVar14.xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
