package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ml0 extends v4.o {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ ql0 k;

    public ml0(ql0 ql0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.k = ql0Var;
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
        org.telegram.messenger.fj fjVar;
        ql0 ql0Var = this.k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.c && i10 == ql0Var.s) {
                return true;
            }
            if (i7 == this.d && i10 == ql0Var.y) {
                return true;
            }
        }
        org.telegram.messenger.fj fjVar2 = null;
        int i11 = this.e;
        if (i7 < i11 || i7 >= this.f) {
            int i12 = this.h;
            fjVar = (i7 < i12 || i7 >= this.i) ? null : (org.telegram.messenger.fj) this.j.get(i7 - i12);
        } else {
            fjVar = (org.telegram.messenger.fj) this.g.get(i7 - i11);
        }
        int i13 = ql0Var.w;
        if (i10 < i13 || i10 >= ql0Var.x) {
            int i14 = ql0Var.E;
            if (i10 >= i14 && i10 < ql0Var.F) {
                fjVar2 = (org.telegram.messenger.fj) ql0Var.f.get(i10 - i14);
            }
        } else {
            fjVar2 = (org.telegram.messenger.fj) ql0Var.e.get(i10 - i13);
        }
        return (fjVar2 == null || fjVar == null || fjVar2.F0() == null || fjVar.F0() == null || fjVar2.F0().id != fjVar.F0().id) ? false : true;
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
