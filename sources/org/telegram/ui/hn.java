package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class hn extends of.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.a0 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = a0Var;
    }

    @Override // of.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f).a, 2), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f).a, 7), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new fh(11, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // of.e
    public final void d() {
        switch (this.d) {
            case 0:
                on onVar = (on) this.f;
                co coVar = onVar.a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                coVar.wb = t1Var.getMessageObject().getId();
                co coVar2 = onVar.a;
                coVar2.xb = 2;
                coVar2.yb = null;
                t1Var.invalidate();
                break;
            case 1:
                on onVar2 = (on) this.f;
                co coVar3 = onVar2.a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                coVar3.wb = t1Var2.getMessageObject().getId();
                co coVar4 = onVar2.a;
                coVar4.xb = 2;
                coVar4.yb = null;
                t1Var2.invalidate();
                break;
            case 2:
                on onVar3 = (on) this.f;
                co coVar5 = onVar3.a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                coVar5.wb = t1Var3.getMessageObject().getId();
                co coVar6 = onVar3.a;
                coVar6.xb = 2;
                coVar6.yb = null;
                t1Var3.invalidate();
                break;
            case 3:
                on onVar4 = (on) this.f;
                co coVar7 = onVar4.a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                coVar7.wb = t1Var4.getMessageObject().getId();
                co coVar8 = onVar4.a;
                coVar8.xb = 2;
                coVar8.yb = null;
                t1Var4.invalidate();
                break;
            case 4:
                on onVar5 = (on) this.f;
                co coVar9 = onVar5.a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                coVar9.wb = t1Var5.getMessageObject().getId();
                co coVar10 = onVar5.a;
                coVar10.xb = 2;
                coVar10.yb = null;
                t1Var5.invalidate();
                break;
            case 5:
                on onVar6 = (on) this.f;
                co coVar11 = onVar6.a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                coVar11.wb = t1Var6.getMessageObject().getId();
                co coVar12 = onVar6.a;
                coVar12.xb = 2;
                coVar12.yb = null;
                t1Var6.invalidate();
                break;
            default:
                fm fmVar = (fm) this.f;
                co coVar13 = fmVar.a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                coVar13.wb = w0Var.getMessageObject().getId();
                co coVar14 = fmVar.a.Q;
                coVar14.xb = 4;
                coVar14.yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                break;
        }
    }
}
