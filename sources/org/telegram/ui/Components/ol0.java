package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ol0 extends v4.p {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ sl0 k;

    public ol0(sl0 sl0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.k = sl0Var;
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

    @Override // v4.p
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override // v4.p
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.fj fjVar;
        sl0 sl0Var = this.k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.c && i10 == sl0Var.s) {
                return true;
            }
            if (i7 == this.d && i10 == sl0Var.y) {
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
        int i13 = sl0Var.w;
        if (i10 < i13 || i10 >= sl0Var.x) {
            int i14 = sl0Var.E;
            if (i10 >= i14 && i10 < sl0Var.F) {
                fjVar2 = (org.telegram.messenger.fj) sl0Var.f.get(i10 - i14);
            }
        } else {
            fjVar2 = (org.telegram.messenger.fj) sl0Var.e.get(i10 - i13);
        }
        return (fjVar2 == null || fjVar == null || fjVar2.F0() == null || fjVar.F0() == null || fjVar2.F0().id != fjVar.F0().id) ? false : true;
    }

    @Override // v4.p
    public final int d() {
        return this.k.r;
    }

    @Override // v4.p
    public final int e() {
        return this.b;
    }
}
