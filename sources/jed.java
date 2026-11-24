// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jed extends aad {
    public final transient Object[] h;
    public final transient boolean n;
    public final transient boolean r;

    /* JADX WARN: Multi-variable type inference failed */
    public jed(int i, Object[] objArr) {
        super((byte) 0);
        this.h = objArr;
        this.n = i;
        this.r = true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        l2f.a(i, this.r ? 1 : 0);
        Object obj = this.h[(i << 1) + (this.n ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r ? 1 : 0;
    }
}
