package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ij b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ oj0 e;

    public /* synthetic */ sj(oj0 oj0Var, ViewGroup viewGroup, org.telegram.messenger.ij ijVar, boolean z9, int i7) {
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
                tj tjVar = (tj) this.e;
                org.telegram.ui.uz uzVar = tjVar.H;
                uj ujVar = tjVar.X;
                boolean x10 = ujVar.b.U2.x();
                boolean z9 = this.c;
                if (!x10) {
                    h7Var.b(false, z9);
                    break;
                } else {
                    org.telegram.messenger.ij ijVar = this.b;
                    int e12 = ijVar.e1();
                    uzVar.a = org.telegram.messenger.ij.B0(ijVar.k);
                    uzVar.b = e12;
                    h7Var.b(ujVar.T.containsKey(uzVar), z9);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var = ((org.telegram.ui.vz) this.e).c;
                boolean i7 = b00Var.o0.i();
                boolean z10 = this.c;
                if (!i7) {
                    t2Var.c0(false, z10);
                    break;
                } else {
                    org.telegram.ui.uz uzVar2 = b00Var.S;
                    org.telegram.messenger.ij ijVar2 = this.b;
                    int e13 = ijVar2.e1();
                    uzVar2.a = org.telegram.messenger.ij.B0(ijVar2.k);
                    uzVar2.b = e13;
                    t2Var.c0(b00Var.o0.f(b00Var.S), z10);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var2 = ((org.telegram.ui.wz) this.e).w;
                boolean i10 = b00Var2.o0.i();
                boolean z11 = this.c;
                if (!i10) {
                    h7Var2.b(false, z11);
                    break;
                } else {
                    org.telegram.ui.uz uzVar3 = b00Var2.S;
                    org.telegram.messenger.ij ijVar3 = this.b;
                    int e14 = ijVar3.e1();
                    uzVar3.a = org.telegram.messenger.ij.B0(ijVar3.k);
                    uzVar3.b = e14;
                    h7Var2.b(b00Var2.o0.f(b00Var2.S), z11);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var3 = ((org.telegram.ui.wz) this.e).w;
                boolean i11 = b00Var3.o0.i();
                boolean z12 = this.c;
                if (!i11) {
                    g7Var.e(false, z12);
                    break;
                } else {
                    org.telegram.ui.uz uzVar4 = b00Var3.S;
                    org.telegram.messenger.ij ijVar4 = this.b;
                    int e15 = ijVar4.e1();
                    uzVar4.a = org.telegram.messenger.ij.B0(ijVar4.k);
                    uzVar4.b = e15;
                    g7Var.e(b00Var3.o0.f(b00Var3.S), z12);
                    break;
                }
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var4 = ((org.telegram.ui.yz) this.e).w;
                boolean i12 = b00Var4.o0.i();
                boolean z13 = this.c;
                if (!i12) {
                    k7Var.f(false, z13);
                    break;
                } else {
                    org.telegram.ui.uz uzVar5 = b00Var4.S;
                    org.telegram.messenger.ij ijVar5 = this.b;
                    int e16 = ijVar5.e1();
                    uzVar5.a = org.telegram.messenger.ij.B0(ijVar5.k);
                    uzVar5.b = e16;
                    k7Var.f(b00Var4.o0.f(b00Var4.S), z13);
                    break;
                }
        }
        return true;
    }
}
