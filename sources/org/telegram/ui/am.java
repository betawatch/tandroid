package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class am extends sf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.z e;
    public final /* synthetic */ Object f;

    public /* synthetic */ am(Object obj, org.telegram.ui.Cells.z zVar, int i3) {
        this.d = i3;
        this.f = obj;
        this.e = zVar;
    }

    @Override // sf.b
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new sc(21, this, (org.telegram.ui.Cells.t0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // sf.b
    public final void d() {
        switch (this.d) {
            case 0:
                hm hmVar = (hm) this.f;
                wm wmVar = hmVar.a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.e;
                wmVar.Xb = q1Var.getMessageObject().f1();
                wm wmVar2 = hmVar.a;
                wmVar2.Yb = 2;
                wmVar2.Zb = null;
                q1Var.invalidate();
                break;
            case 1:
                hm hmVar2 = (hm) this.f;
                wm wmVar3 = hmVar2.a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                wmVar3.Xb = q1Var2.getMessageObject().f1();
                wm wmVar4 = hmVar2.a;
                wmVar4.Yb = 2;
                wmVar4.Zb = null;
                q1Var2.invalidate();
                break;
            case 2:
                hm hmVar3 = (hm) this.f;
                wm wmVar5 = hmVar3.a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.e;
                wmVar5.Xb = q1Var3.getMessageObject().f1();
                wm wmVar6 = hmVar3.a;
                wmVar6.Yb = 2;
                wmVar6.Zb = null;
                q1Var3.invalidate();
                break;
            case 3:
                hm hmVar4 = (hm) this.f;
                wm wmVar7 = hmVar4.a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.e;
                wmVar7.Xb = q1Var4.getMessageObject().f1();
                wm wmVar8 = hmVar4.a;
                wmVar8.Yb = 2;
                wmVar8.Zb = null;
                q1Var4.invalidate();
                break;
            case 4:
                hm hmVar5 = (hm) this.f;
                wm wmVar9 = hmVar5.a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.e;
                wmVar9.Xb = q1Var5.getMessageObject().f1();
                wm wmVar10 = hmVar5.a;
                wmVar10.Yb = 2;
                wmVar10.Zb = null;
                q1Var5.invalidate();
                break;
            case 5:
                hm hmVar6 = (hm) this.f;
                wm wmVar11 = hmVar6.a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.e;
                wmVar11.Xb = q1Var6.getMessageObject().f1();
                wm wmVar12 = hmVar6.a;
                wmVar12.Yb = 2;
                wmVar12.Zb = null;
                q1Var6.invalidate();
                break;
            default:
                al alVar = (al) this.f;
                wm wmVar13 = alVar.a.R;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.e;
                wmVar13.Xb = t0Var.getMessageObject().f1();
                wm wmVar14 = alVar.a.R;
                wmVar14.Yb = 4;
                wmVar14.Zb = null;
                t0Var.getMessageObject().r = true;
                t0Var.invalidate();
                break;
        }
    }
}
