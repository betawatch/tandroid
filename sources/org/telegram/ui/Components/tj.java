package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ij b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ pj0 e;

    public /* synthetic */ tj(pj0 pj0Var, ViewGroup viewGroup, org.telegram.messenger.ij ijVar, boolean z9, int i7) {
        this.a = i7;
        this.e = pj0Var;
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
                org.telegram.ui.tz tzVar = ujVar.H;
                vj vjVar = ujVar.X;
                boolean w10 = vjVar.b.R2.w();
                boolean z9 = this.c;
                if (!w10) {
                    h7Var.b(false, z9);
                    break;
                } else {
                    org.telegram.messenger.ij ijVar = this.b;
                    int e12 = ijVar.e1();
                    tzVar.a = org.telegram.messenger.ij.B0(ijVar.k);
                    tzVar.b = e12;
                    h7Var.b(vjVar.T.containsKey(tzVar), z9);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.a00 a00Var = ((org.telegram.ui.uz) this.e).c;
                boolean i7 = a00Var.o0.i();
                boolean z10 = this.c;
                if (!i7) {
                    t2Var.c0(false, z10);
                    break;
                } else {
                    org.telegram.ui.tz tzVar2 = a00Var.S;
                    org.telegram.messenger.ij ijVar2 = this.b;
                    int e13 = ijVar2.e1();
                    tzVar2.a = org.telegram.messenger.ij.B0(ijVar2.k);
                    tzVar2.b = e13;
                    t2Var.c0(a00Var.o0.f(a00Var.S), z10);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.a00 a00Var2 = ((org.telegram.ui.vz) this.e).w;
                boolean i10 = a00Var2.o0.i();
                boolean z11 = this.c;
                if (!i10) {
                    h7Var2.b(false, z11);
                    break;
                } else {
                    org.telegram.ui.tz tzVar3 = a00Var2.S;
                    org.telegram.messenger.ij ijVar3 = this.b;
                    int e14 = ijVar3.e1();
                    tzVar3.a = org.telegram.messenger.ij.B0(ijVar3.k);
                    tzVar3.b = e14;
                    h7Var2.b(a00Var2.o0.f(a00Var2.S), z11);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.a00 a00Var3 = ((org.telegram.ui.vz) this.e).w;
                boolean i11 = a00Var3.o0.i();
                boolean z12 = this.c;
                if (!i11) {
                    g7Var.e(false, z12);
                    break;
                } else {
                    org.telegram.ui.tz tzVar4 = a00Var3.S;
                    org.telegram.messenger.ij ijVar4 = this.b;
                    int e15 = ijVar4.e1();
                    tzVar4.a = org.telegram.messenger.ij.B0(ijVar4.k);
                    tzVar4.b = e15;
                    g7Var.e(a00Var3.o0.f(a00Var3.S), z12);
                    break;
                }
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.a00 a00Var4 = ((org.telegram.ui.xz) this.e).w;
                boolean i12 = a00Var4.o0.i();
                boolean z13 = this.c;
                if (!i12) {
                    k7Var.f(false, z13);
                    break;
                } else {
                    org.telegram.ui.tz tzVar5 = a00Var4.S;
                    org.telegram.messenger.ij ijVar5 = this.b;
                    int e16 = ijVar5.e1();
                    tzVar5.a = org.telegram.messenger.ij.B0(ijVar5.k);
                    tzVar5.b = e16;
                    k7Var.f(a00Var4.o0.f(a00Var4.S), z13);
                    break;
                }
        }
        return true;
    }
}
