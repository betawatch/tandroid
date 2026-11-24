// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum ace implements boe {
    b(0),
    c(1),
    d(2),
    e(3),
    f(4),
    h(5),
    n(6),
    r(7),
    s(8),
    w(9),
    x(10),
    y(11),
    E(12),
    F(13),
    G(14),
    H(16);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    ace(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ace.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
