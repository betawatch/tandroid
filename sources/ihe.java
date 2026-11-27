// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum ihe implements sse {
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
    F(13);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    ihe(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ihe.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
