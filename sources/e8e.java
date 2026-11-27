// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class e8e extends k8e {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ k8e w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8e(k8e k8eVar, int i, int i2) {
        super((byte) 5);
        this.w = k8eVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h6f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // b4d
    public final int q() {
        return this.w.s() + this.r + this.s;
    }

    @Override // b4d
    public final int s() {
        return this.w.s() + this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // b4d
    public final Object[] x() {
        return this.w.x();
    }

    @Override // k8e, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final k8e subList(int i, int i2) {
        h6f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
