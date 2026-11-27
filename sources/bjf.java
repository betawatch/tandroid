// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bjf extends zjf {
    public final transient int h;
    public final transient int n;
    public final /* synthetic */ zjf r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjf(zjf zjfVar, int i, int i2) {
        super((byte) 3);
        this.r = zjfVar;
        this.h = i;
        this.n = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j7f.a(i, this.n);
        return this.r.get(i + this.h);
    }

    @Override // qdd
    public final int i() {
        return this.r.j() + this.h + this.n;
    }

    @Override // qdd
    public final int j() {
        return this.r.j() + this.h;
    }

    @Override // qdd
    public final Object[] k() {
        return this.r.k();
    }

    @Override // zjf, java.util.List
    /* renamed from: l */
    public final zjf subList(int i, int i2) {
        j7f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
