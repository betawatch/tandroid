package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class an extends qf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.z e;
    public final /* synthetic */ Object f;

    public /* synthetic */ an(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f = obj;
        this.e = zVar;
    }

    @Override // qf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f).a, 8), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f).a, 9), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f).a, 10), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ed(19, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // qf.c
    public final void d() {
        switch (this.d) {
            case 0:
                hn hnVar = (hn) this.f;
                wn wnVar = hnVar.a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                wnVar.Wb = s1Var.getMessageObject().getId();
                wn wnVar2 = hnVar.a;
                wnVar2.Xb = 2;
                wnVar2.Yb = null;
                s1Var.invalidate();
                break;
            case 1:
                hn hnVar2 = (hn) this.f;
                wn wnVar3 = hnVar2.a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.e;
                wnVar3.Wb = s1Var2.getMessageObject().getId();
                wn wnVar4 = hnVar2.a;
                wnVar4.Xb = 2;
                wnVar4.Yb = null;
                s1Var2.invalidate();
                break;
            case 2:
                hn hnVar3 = (hn) this.f;
                wn wnVar5 = hnVar3.a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.e;
                wnVar5.Wb = s1Var3.getMessageObject().getId();
                wn wnVar6 = hnVar3.a;
                wnVar6.Xb = 2;
                wnVar6.Yb = null;
                s1Var3.invalidate();
                break;
            case 3:
                hn hnVar4 = (hn) this.f;
                wn wnVar7 = hnVar4.a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.e;
                wnVar7.Wb = s1Var4.getMessageObject().getId();
                wn wnVar8 = hnVar4.a;
                wnVar8.Xb = 2;
                wnVar8.Yb = null;
                s1Var4.invalidate();
                break;
            case 4:
                hn hnVar5 = (hn) this.f;
                wn wnVar9 = hnVar5.a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.e;
                wnVar9.Wb = s1Var5.getMessageObject().getId();
                wn wnVar10 = hnVar5.a;
                wnVar10.Xb = 2;
                wnVar10.Yb = null;
                s1Var5.invalidate();
                break;
            case 5:
                hn hnVar6 = (hn) this.f;
                wn wnVar11 = hnVar6.a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.e;
                wnVar11.Wb = s1Var6.getMessageObject().getId();
                wn wnVar12 = hnVar6.a;
                wnVar12.Xb = 2;
                wnVar12.Yb = null;
                s1Var6.invalidate();
                break;
            default:
                yl ylVar = (yl) this.f;
                wn wnVar13 = ylVar.a.Q;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                wnVar13.Wb = v0Var.getMessageObject().getId();
                wn wnVar14 = ylVar.a.Q;
                wnVar14.Xb = 4;
                wnVar14.Yb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                break;
        }
    }
}
