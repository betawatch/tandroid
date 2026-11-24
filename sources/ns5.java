// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ns5 extends v5c {
    public final Object b;
    public boolean c;

    public ns5(Object obj) {
        super((byte) 0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            w26.g();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
