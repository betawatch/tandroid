package c7;

import g7.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t extends u {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ u e;

    public t(u uVar, int i10, int i11) {
        this.e = uVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j0.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // c7.r
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // c7.r
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // c7.r
    public final boolean p() {
        return true;
    }

    @Override // c7.r
    public final Object[] q() {
        return this.e.q();
    }

    @Override // c7.u, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final u subList(int i10, int i11) {
        j0.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
