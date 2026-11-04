package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.zi b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ sj0 e;

    public /* synthetic */ sj(sj0 sj0Var, ViewGroup viewGroup, org.telegram.messenger.zi ziVar, boolean z10, int i3) {
        this.a = i3;
        this.e = sj0Var;
        this.d = viewGroup;
        this.b = ziVar;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                tj tjVar = (tj) this.e;
                org.telegram.ui.pz pzVar = tjVar.I;
                uj ujVar = tjVar.Y;
                boolean v = ujVar.b.S2.v();
                boolean z10 = this.c;
                if (!v) {
                    g7Var.b(false, z10);
                    break;
                } else {
                    org.telegram.messenger.zi ziVar = this.b;
                    int f12 = ziVar.f1();
                    pzVar.a = org.telegram.messenger.zi.B0(ziVar.k);
                    pzVar.b = f12;
                    g7Var.b(ujVar.U.containsKey(pzVar), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.wz wzVar = ((org.telegram.ui.qz) this.e).c;
                boolean I = wzVar.p0.I();
                boolean z11 = this.c;
                if (!I) {
                    t2Var.c0(false, z11);
                    break;
                } else {
                    org.telegram.ui.pz pzVar2 = wzVar.T;
                    org.telegram.messenger.zi ziVar2 = this.b;
                    int f13 = ziVar2.f1();
                    pzVar2.a = org.telegram.messenger.zi.B0(ziVar2.k);
                    pzVar2.b = f13;
                    t2Var.c0(wzVar.p0.n(wzVar.T), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) this.d;
                g7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.wz wzVar2 = ((org.telegram.ui.rz) this.e).w;
                boolean I2 = wzVar2.p0.I();
                boolean z12 = this.c;
                if (!I2) {
                    g7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.pz pzVar3 = wzVar2.T;
                    org.telegram.messenger.zi ziVar3 = this.b;
                    int f14 = ziVar3.f1();
                    pzVar3.a = org.telegram.messenger.zi.B0(ziVar3.k);
                    pzVar3.b = f14;
                    g7Var2.b(wzVar2.p0.n(wzVar2.T), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.wz wzVar3 = ((org.telegram.ui.rz) this.e).w;
                boolean I3 = wzVar3.p0.I();
                boolean z13 = this.c;
                if (!I3) {
                    f7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.pz pzVar4 = wzVar3.T;
                    org.telegram.messenger.zi ziVar4 = this.b;
                    int f15 = ziVar4.f1();
                    pzVar4.a = org.telegram.messenger.zi.B0(ziVar4.k);
                    pzVar4.b = f15;
                    f7Var.e(wzVar3.p0.n(wzVar3.T), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.wz wzVar4 = ((org.telegram.ui.tz) this.e).w;
                boolean I4 = wzVar4.p0.I();
                boolean z14 = this.c;
                if (!I4) {
                    j7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.pz pzVar5 = wzVar4.T;
                    org.telegram.messenger.zi ziVar5 = this.b;
                    int f16 = ziVar5.f1();
                    pzVar5.a = org.telegram.messenger.zi.B0(ziVar5.k);
                    pzVar5.b = f16;
                    j7Var.f(wzVar4.p0.n(wzVar4.T), z14);
                    break;
                }
        }
        return true;
    }
}
