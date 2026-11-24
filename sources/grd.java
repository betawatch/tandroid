// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class grd extends nrd {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ nrd e;

    public grd(nrd nrdVar, int i, int i2) {
        this.e = nrdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i1f.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // ard
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // ard
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // ard
    public final Object[] l() {
        return this.e.l();
    }

    @Override // nrd, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final nrd subList(int i, int i2) {
        i1f.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
