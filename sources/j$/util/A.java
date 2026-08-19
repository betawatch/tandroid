package j$.util;

/* loaded from: classes2.dex */
public final class A {
    public static final A c = new A();
    public final boolean a;
    public final int b;

    public A() {
        this.a = false;
        this.b = 0;
    }

    public A(int i) {
        this.a = true;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        boolean z = this.a;
        return (z && a.a) ? this.b == a.b : z == a.a;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalInt[" + this.b + "]";
        }
        return "OptionalInt.empty";
    }
}
