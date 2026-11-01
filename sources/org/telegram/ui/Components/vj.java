package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.kj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ tk0 e;

    public /* synthetic */ vj(tk0 tk0Var, ViewGroup viewGroup, org.telegram.messenger.kj kjVar, boolean z10, int i10) {
        this.a = i10;
        this.e = tk0Var;
        this.d = viewGroup;
        this.b = kjVar;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                wj wjVar = (wj) this.e;
                org.telegram.ui.r00 r00Var = wjVar.H;
                xj xjVar = wjVar.X;
                boolean u10 = xjVar.b.R2.u();
                boolean z10 = this.c;
                if (!u10) {
                    l7Var.b(false, z10);
                    break;
                } else {
                    org.telegram.messenger.kj kjVar = this.b;
                    int f12 = kjVar.f1();
                    r00Var.a = org.telegram.messenger.kj.B0(kjVar.k);
                    r00Var.b = f12;
                    l7Var.b(xjVar.T.containsKey(r00Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) this.d;
                v2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y00 y00Var = ((org.telegram.ui.s00) this.e).c;
                boolean f7 = y00Var.o0.f();
                boolean z11 = this.c;
                if (!f7) {
                    v2Var.c0(false, z11);
                    break;
                } else {
                    org.telegram.ui.r00 r00Var2 = y00Var.S;
                    org.telegram.messenger.kj kjVar2 = this.b;
                    int f13 = kjVar2.f1();
                    r00Var2.a = org.telegram.messenger.kj.B0(kjVar2.k);
                    r00Var2.b = f13;
                    v2Var.c0(y00Var.o0.b(y00Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) this.d;
                l7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y00 y00Var2 = ((org.telegram.ui.t00) this.e).w;
                boolean f10 = y00Var2.o0.f();
                boolean z12 = this.c;
                if (!f10) {
                    l7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.r00 r00Var3 = y00Var2.S;
                    org.telegram.messenger.kj kjVar3 = this.b;
                    int f14 = kjVar3.f1();
                    r00Var3.a = org.telegram.messenger.kj.B0(kjVar3.k);
                    r00Var3.b = f14;
                    l7Var2.b(y00Var2.o0.b(y00Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y00 y00Var3 = ((org.telegram.ui.t00) this.e).w;
                boolean f11 = y00Var3.o0.f();
                boolean z13 = this.c;
                if (!f11) {
                    k7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.r00 r00Var4 = y00Var3.S;
                    org.telegram.messenger.kj kjVar4 = this.b;
                    int f15 = kjVar4.f1();
                    r00Var4.a = org.telegram.messenger.kj.B0(kjVar4.k);
                    r00Var4.b = f15;
                    k7Var.e(y00Var3.o0.b(y00Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y00 y00Var4 = ((org.telegram.ui.v00) this.e).w;
                boolean f16 = y00Var4.o0.f();
                boolean z14 = this.c;
                if (!f16) {
                    o7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.r00 r00Var5 = y00Var4.S;
                    org.telegram.messenger.kj kjVar5 = this.b;
                    int f17 = kjVar5.f1();
                    r00Var5.a = org.telegram.messenger.kj.B0(kjVar5.k);
                    r00Var5.b = f17;
                    o7Var.f(y00Var4.o0.b(y00Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
