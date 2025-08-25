package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C {
    private static final C c = new C();
    private final boolean a;
    private final long b;

    private C() {
        this.a = false;
        this.b = 0L;
    }

    public static C a() {
        return c;
    }

    private C(long j) {
        this.a = true;
        this.b = j;
    }

    public static C d(long j) {
        return new C(j);
    }

    public final long b() {
        if (!this.a) {
            throw new NoSuchElementException("No value present");
        }
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        boolean z = this.a;
        if (z && c2.a) {
            if (this.b == c2.b) {
                return true;
            }
        } else if (z == c2.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalLong[" + this.b + "]";
        }
        return "OptionalLong.empty";
    }
}
