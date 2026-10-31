package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cm0 extends s4.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ gm0 k;

    public cm0(gm0 gm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.k = gm0Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
        this.g = arrayList;
        this.h = i15;
        this.i = i16;
        this.j = arrayList2;
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        org.telegram.messenger.jj jjVar;
        gm0 gm0Var = this.k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.c && i11 == gm0Var.s) {
                return true;
            }
            if (i10 == this.d && i11 == gm0Var.y) {
                return true;
            }
        }
        org.telegram.messenger.jj jjVar2 = null;
        int i12 = this.e;
        if (i10 < i12 || i10 >= this.f) {
            int i13 = this.h;
            jjVar = (i10 < i13 || i10 >= this.i) ? null : (org.telegram.messenger.jj) this.j.get(i10 - i13);
        } else {
            jjVar = (org.telegram.messenger.jj) this.g.get(i10 - i12);
        }
        int i14 = gm0Var.w;
        if (i11 < i14 || i11 >= gm0Var.x) {
            int i15 = gm0Var.D;
            if (i11 >= i15 && i11 < gm0Var.E) {
                jjVar2 = (org.telegram.messenger.jj) gm0Var.f.get(i11 - i15);
            }
        } else {
            jjVar2 = (org.telegram.messenger.jj) gm0Var.e.get(i11 - i14);
        }
        return (jjVar2 == null || jjVar == null || jjVar2.F0() == null || jjVar.F0() == null || jjVar2.F0().id != jjVar.F0().id) ? false : true;
    }

    @Override // s4.n
    public final int d() {
        return this.k.r;
    }

    @Override // s4.n
    public final int e() {
        return this.b;
    }
}
