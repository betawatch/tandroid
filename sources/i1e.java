// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum i1e implements boe {
    b(0),
    c(1),
    d(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    i1e(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + i1e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
