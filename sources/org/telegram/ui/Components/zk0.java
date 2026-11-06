package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zk0 extends v4.o {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ dl0 k;

    public zk0(dl0 dl0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.k = dl0Var;
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
        org.telegram.messenger.ij ijVar;
        dl0 dl0Var = this.k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.c && i10 == dl0Var.s) {
                return true;
            }
            if (i7 == this.d && i10 == dl0Var.y) {
                return true;
            }
        }
        org.telegram.messenger.ij ijVar2 = null;
        int i11 = this.e;
        if (i7 < i11 || i7 >= this.f) {
            int i12 = this.h;
            ijVar = (i7 < i12 || i7 >= this.i) ? null : (org.telegram.messenger.ij) this.j.get(i7 - i12);
        } else {
            ijVar = (org.telegram.messenger.ij) this.g.get(i7 - i11);
        }
        int i13 = dl0Var.w;
        if (i10 < i13 || i10 >= dl0Var.x) {
            int i14 = dl0Var.D;
            if (i10 >= i14 && i10 < dl0Var.E) {
                ijVar2 = (org.telegram.messenger.ij) dl0Var.f.get(i10 - i14);
            }
        } else {
            ijVar2 = (org.telegram.messenger.ij) dl0Var.e.get(i10 - i13);
        }
        return (ijVar2 == null || ijVar == null || ijVar2.F0() == null || ijVar.F0() == null || ijVar2.F0().id != ijVar.F0().id) ? false : true;
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
