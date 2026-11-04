package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dl0 extends u4.o {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ hl0 k;

    public dl0(hl0 hl0Var, int i3, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.k = hl0Var;
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = arrayList;
        this.h = i14;
        this.i = i15;
        this.j = arrayList2;
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        return b(i3, i10);
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        org.telegram.messenger.zi ziVar;
        hl0 hl0Var = this.k;
        if (i3 >= 0 && i10 >= 0) {
            if (i3 == this.c && i10 == hl0Var.s) {
                return true;
            }
            if (i3 == this.d && i10 == hl0Var.y) {
                return true;
            }
        }
        org.telegram.messenger.zi ziVar2 = null;
        int i11 = this.e;
        if (i3 < i11 || i3 >= this.f) {
            int i12 = this.h;
            ziVar = (i3 < i12 || i3 >= this.i) ? null : (org.telegram.messenger.zi) this.j.get(i3 - i12);
        } else {
            ziVar = (org.telegram.messenger.zi) this.g.get(i3 - i11);
        }
        int i13 = hl0Var.w;
        if (i10 < i13 || i10 >= hl0Var.x) {
            int i14 = hl0Var.E;
            if (i10 >= i14 && i10 < hl0Var.F) {
                ziVar2 = (org.telegram.messenger.zi) hl0Var.f.get(i10 - i14);
            }
        } else {
            ziVar2 = (org.telegram.messenger.zi) hl0Var.e.get(i10 - i13);
        }
        return (ziVar2 == null || ziVar == null || ziVar2.F0() == null || ziVar.F0() == null || ziVar2.F0().id != ziVar.F0().id) ? false : true;
    }

    @Override // u4.o
    public final int d() {
        return this.k.r;
    }

    @Override // u4.o
    public final int e() {
        return this.b;
    }
}
