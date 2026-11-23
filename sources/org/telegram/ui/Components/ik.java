package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ik implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.fj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ dk0 e;

    public /* synthetic */ ik(dk0 dk0Var, ViewGroup viewGroup, org.telegram.messenger.fj fjVar, boolean z10, int i7) {
        this.a = i7;
        this.e = dk0Var;
        this.d = viewGroup;
        this.b = fjVar;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                jk jkVar = (jk) this.e;
                org.telegram.ui.uz uzVar = jkVar.I;
                kk kkVar = jkVar.Y;
                boolean x10 = kkVar.b.V2.x();
                boolean z10 = this.c;
                if (!x10) {
                    h7Var.b(false, z10);
                    break;
                } else {
                    org.telegram.messenger.fj fjVar = this.b;
                    int e12 = fjVar.e1();
                    uzVar.a = org.telegram.messenger.fj.B0(fjVar.k);
                    uzVar.b = e12;
                    h7Var.b(kkVar.U.containsKey(uzVar), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.d;
                u2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var = ((org.telegram.ui.vz) this.e).c;
                boolean i02 = b00Var.p0.i0();
                boolean z11 = this.c;
                if (!i02) {
                    u2Var.e0(false, z11);
                    break;
                } else {
                    org.telegram.ui.uz uzVar2 = b00Var.T;
                    org.telegram.messenger.fj fjVar2 = this.b;
                    int e13 = fjVar2.e1();
                    uzVar2.a = org.telegram.messenger.fj.B0(fjVar2.k);
                    uzVar2.b = e13;
                    u2Var.e0(b00Var.p0.j(b00Var.T), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var2 = ((org.telegram.ui.wz) this.e).w;
                boolean i03 = b00Var2.p0.i0();
                boolean z12 = this.c;
                if (!i03) {
                    h7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.uz uzVar3 = b00Var2.T;
                    org.telegram.messenger.fj fjVar3 = this.b;
                    int e14 = fjVar3.e1();
                    uzVar3.a = org.telegram.messenger.fj.B0(fjVar3.k);
                    uzVar3.b = e14;
                    h7Var2.b(b00Var2.p0.j(b00Var2.T), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var3 = ((org.telegram.ui.wz) this.e).w;
                boolean i04 = b00Var3.p0.i0();
                boolean z13 = this.c;
                if (!i04) {
                    g7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.uz uzVar4 = b00Var3.T;
                    org.telegram.messenger.fj fjVar4 = this.b;
                    int e15 = fjVar4.e1();
                    uzVar4.a = org.telegram.messenger.fj.B0(fjVar4.k);
                    uzVar4.b = e15;
                    g7Var.e(b00Var3.p0.j(b00Var3.T), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var4 = ((org.telegram.ui.yz) this.e).w;
                boolean i05 = b00Var4.p0.i0();
                boolean z14 = this.c;
                if (!i05) {
                    k7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.uz uzVar5 = b00Var4.T;
                    org.telegram.messenger.fj fjVar5 = this.b;
                    int e16 = fjVar5.e1();
                    uzVar5.a = org.telegram.messenger.fj.B0(fjVar5.k);
                    uzVar5.b = e16;
                    k7Var.f(b00Var4.p0.j(b00Var4.T), z14);
                    break;
                }
        }
        return true;
    }
}
