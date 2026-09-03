package f7;

import j7.l7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        l7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // f7.r
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // f7.r
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // f7.r
    public final boolean p() {
        return true;
    }

    @Override // f7.r
    public final Object[] q() {
        return this.e.q();
    }

    @Override // f7.u, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final u subList(int i10, int i11) {
        l7.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
