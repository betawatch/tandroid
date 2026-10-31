package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.jj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ sk0 e;

    public /* synthetic */ vj(sk0 sk0Var, ViewGroup viewGroup, org.telegram.messenger.jj jjVar, boolean z10, int i10) {
        this.a = i10;
        this.e = sk0Var;
        this.d = viewGroup;
        this.b = jjVar;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                wj wjVar = (wj) this.e;
                org.telegram.ui.s00 s00Var = wjVar.H;
                xj xjVar = wjVar.X;
                boolean u10 = xjVar.b.R2.u();
                boolean z10 = this.c;
                if (!u10) {
                    l7Var.b(false, z10);
                    break;
                } else {
                    org.telegram.messenger.jj jjVar = this.b;
                    int f12 = jjVar.f1();
                    s00Var.a = org.telegram.messenger.jj.B0(jjVar.k);
                    s00Var.b = f12;
                    l7Var.b(xjVar.T.containsKey(s00Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) this.d;
                v2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z00 z00Var = ((org.telegram.ui.t00) this.e).c;
                boolean f7 = z00Var.o0.f();
                boolean z11 = this.c;
                if (!f7) {
                    v2Var.c0(false, z11);
                    break;
                } else {
                    org.telegram.ui.s00 s00Var2 = z00Var.S;
                    org.telegram.messenger.jj jjVar2 = this.b;
                    int f13 = jjVar2.f1();
                    s00Var2.a = org.telegram.messenger.jj.B0(jjVar2.k);
                    s00Var2.b = f13;
                    v2Var.c0(z00Var.o0.b(z00Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) this.d;
                l7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z00 z00Var2 = ((org.telegram.ui.u00) this.e).w;
                boolean f10 = z00Var2.o0.f();
                boolean z12 = this.c;
                if (!f10) {
                    l7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.s00 s00Var3 = z00Var2.S;
                    org.telegram.messenger.jj jjVar3 = this.b;
                    int f14 = jjVar3.f1();
                    s00Var3.a = org.telegram.messenger.jj.B0(jjVar3.k);
                    s00Var3.b = f14;
                    l7Var2.b(z00Var2.o0.b(z00Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z00 z00Var3 = ((org.telegram.ui.u00) this.e).w;
                boolean f11 = z00Var3.o0.f();
                boolean z13 = this.c;
                if (!f11) {
                    k7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.s00 s00Var4 = z00Var3.S;
                    org.telegram.messenger.jj jjVar4 = this.b;
                    int f15 = jjVar4.f1();
                    s00Var4.a = org.telegram.messenger.jj.B0(jjVar4.k);
                    s00Var4.b = f15;
                    k7Var.e(z00Var3.o0.b(z00Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z00 z00Var4 = ((org.telegram.ui.w00) this.e).w;
                boolean f16 = z00Var4.o0.f();
                boolean z14 = this.c;
                if (!f16) {
                    o7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.s00 s00Var5 = z00Var4.S;
                    org.telegram.messenger.jj jjVar5 = this.b;
                    int f17 = jjVar5.f1();
                    s00Var5.a = org.telegram.messenger.jj.B0(jjVar5.k);
                    s00Var5.b = f17;
                    o7Var.f(z00Var4.o0.b(z00Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
