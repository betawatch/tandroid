package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dm0 extends s4.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ hm0 k;

    public dm0(hm0 hm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.k = hm0Var;
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
        org.telegram.messenger.kj kjVar;
        hm0 hm0Var = this.k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.c && i11 == hm0Var.s) {
                return true;
            }
            if (i10 == this.d && i11 == hm0Var.y) {
                return true;
            }
        }
        org.telegram.messenger.kj kjVar2 = null;
        int i12 = this.e;
        if (i10 < i12 || i10 >= this.f) {
            int i13 = this.h;
            kjVar = (i10 < i13 || i10 >= this.i) ? null : (org.telegram.messenger.kj) this.j.get(i10 - i13);
        } else {
            kjVar = (org.telegram.messenger.kj) this.g.get(i10 - i12);
        }
        int i14 = hm0Var.w;
        if (i11 < i14 || i11 >= hm0Var.x) {
            int i15 = hm0Var.D;
            if (i11 >= i15 && i11 < hm0Var.E) {
                kjVar2 = (org.telegram.messenger.kj) hm0Var.f.get(i11 - i15);
            }
        } else {
            kjVar2 = (org.telegram.messenger.kj) hm0Var.e.get(i11 - i14);
        }
        return (kjVar2 == null || kjVar == null || kjVar2.F0() == null || kjVar.F0() == null || kjVar2.F0().id != kjVar.F0().id) ? false : true;
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
