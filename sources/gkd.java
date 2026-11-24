// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gkd extends v5c {
    public static final Object c = new Object();
    public Object b;

    public gkd(Object obj) {
        super((byte) 10);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        w26.g();
        return null;
    }
}
