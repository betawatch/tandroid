// default package

import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ma0 {
    public final long a;
    public final long b;
    public final Set c;

    public ma0(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ma0) {
            ma0 ma0Var = (ma0) obj;
            if (this.a == ma0Var.a && this.b == ma0Var.b && this.c.equals(ma0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
