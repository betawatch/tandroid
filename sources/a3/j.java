package a3;

import e2.m1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j extends q implements Comparable {
    public final int e;
    public final int f;

    public j(int i7, m1 m1Var, int i10, n nVar, int i11) {
        super(i7, m1Var, i10);
        int i12;
        this.e = jg.g.c(i11, nVar.B0) ? 1 : 0;
        e2.u uVar = this.d;
        int i13 = uVar.z;
        int i14 = -1;
        if (i13 != -1 && (i12 = uVar.A) != -1) {
            i14 = i13 * i12;
        }
        this.f = i14;
    }

    @Override // a3.q
    public final int a() {
        return this.e;
    }

    @Override // a3.q
    public final /* bridge */ /* synthetic */ boolean b(q qVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((j) obj).f);
    }
}
