package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class tj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ij b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ oj0 e;

    public /* synthetic */ tj(oj0 oj0Var, ViewGroup viewGroup, org.telegram.messenger.ij ijVar, boolean z9, int i7) {
        this.a = i7;
        this.e = oj0Var;
        this.d = viewGroup;
        this.b = ijVar;
        this.c = z9;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                uj ujVar = (uj) this.e;
                org.telegram.ui.rz rzVar = ujVar.H;
                vj vjVar = ujVar.X;
                boolean v = vjVar.b.R2.v();
                boolean z9 = this.c;
                if (!v) {
                    h7Var.b(false, z9);
                    break;
                } else {
                    org.telegram.messenger.ij ijVar = this.b;
                    int f12 = ijVar.f1();
                    rzVar.a = org.telegram.messenger.ij.B0(ijVar.k);
                    rzVar.b = f12;
                    h7Var.b(vjVar.T.containsKey(rzVar), z9);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.yz yzVar = ((org.telegram.ui.sz) this.e).c;
                boolean i7 = yzVar.o0.i();
                boolean z10 = this.c;
                if (!i7) {
                    t2Var.c0(false, z10);
                    break;
                } else {
                    org.telegram.ui.rz rzVar2 = yzVar.S;
                    org.telegram.messenger.ij ijVar2 = this.b;
                    int f13 = ijVar2.f1();
                    rzVar2.a = org.telegram.messenger.ij.B0(ijVar2.k);
                    rzVar2.b = f13;
                    t2Var.c0(yzVar.o0.f(yzVar.S), z10);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.yz yzVar2 = ((org.telegram.ui.tz) this.e).w;
                boolean i10 = yzVar2.o0.i();
                boolean z11 = this.c;
                if (!i10) {
                    h7Var2.b(false, z11);
                    break;
                } else {
                    org.telegram.ui.rz rzVar3 = yzVar2.S;
                    org.telegram.messenger.ij ijVar3 = this.b;
                    int f14 = ijVar3.f1();
                    rzVar3.a = org.telegram.messenger.ij.B0(ijVar3.k);
                    rzVar3.b = f14;
                    h7Var2.b(yzVar2.o0.f(yzVar2.S), z11);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.yz yzVar3 = ((org.telegram.ui.tz) this.e).w;
                boolean i11 = yzVar3.o0.i();
                boolean z12 = this.c;
                if (!i11) {
                    g7Var.e(false, z12);
                    break;
                } else {
                    org.telegram.ui.rz rzVar4 = yzVar3.S;
                    org.telegram.messenger.ij ijVar4 = this.b;
                    int f15 = ijVar4.f1();
                    rzVar4.a = org.telegram.messenger.ij.B0(ijVar4.k);
                    rzVar4.b = f15;
                    g7Var.e(yzVar3.o0.f(yzVar3.S), z12);
                    break;
                }
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.yz yzVar4 = ((org.telegram.ui.vz) this.e).w;
                boolean i12 = yzVar4.o0.i();
                boolean z13 = this.c;
                if (!i12) {
                    k7Var.f(false, z13);
                    break;
                } else {
                    org.telegram.ui.rz rzVar5 = yzVar4.S;
                    org.telegram.messenger.ij ijVar5 = this.b;
                    int f16 = ijVar5.f1();
                    rzVar5.a = org.telegram.messenger.ij.B0(ijVar5.k);
                    rzVar5.b = f16;
                    k7Var.f(yzVar4.o0.f(yzVar4.S), z13);
                    break;
                }
        }
        return true;
    }
}
