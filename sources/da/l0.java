package da;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class l0 extends y1 {
    public final int a;

    public l0(int i7) {
        this.a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            if (this.a == ((l0) ((y1) obj)).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a;
    }

    public final String toString() {
        return a8.p0.n(this.a, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }
}
