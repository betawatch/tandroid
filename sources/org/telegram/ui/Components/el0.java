package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class el0 extends v4.o {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ il0 k;

    public el0(il0 il0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.k = il0Var;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = arrayList;
        this.h = i14;
        this.i = i15;
        this.j = arrayList2;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.gj gjVar;
        il0 il0Var = this.k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.c && i10 == il0Var.s) {
                return true;
            }
            if (i7 == this.d && i10 == il0Var.y) {
                return true;
            }
        }
        org.telegram.messenger.gj gjVar2 = null;
        int i11 = this.e;
        if (i7 < i11 || i7 >= this.f) {
            int i12 = this.h;
            gjVar = (i7 < i12 || i7 >= this.i) ? null : (org.telegram.messenger.gj) this.j.get(i7 - i12);
        } else {
            gjVar = (org.telegram.messenger.gj) this.g.get(i7 - i11);
        }
        int i13 = il0Var.w;
        if (i10 < i13 || i10 >= il0Var.x) {
            int i14 = il0Var.E;
            if (i10 >= i14 && i10 < il0Var.F) {
                gjVar2 = (org.telegram.messenger.gj) il0Var.f.get(i10 - i14);
            }
        } else {
            gjVar2 = (org.telegram.messenger.gj) il0Var.e.get(i10 - i13);
        }
        return (gjVar2 == null || gjVar == null || gjVar2.F0() == null || gjVar.F0() == null || gjVar2.F0().id != gjVar.F0().id) ? false : true;
    }

    @Override // v4.o
    public final int d() {
        return this.k.r;
    }

    @Override // v4.o
    public final int e() {
        return this.b;
    }
}
