// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bf7 {
    public long a;
    public long b;

    public static bf7 a(long j, long j2) {
        bf7 bf7Var = new bf7();
        bf7Var.a = j;
        bf7Var.b = j2;
        return bf7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf7.class == obj.getClass()) {
            bf7 bf7Var = (bf7) obj;
            if (this.a == bf7Var.a && this.b == bf7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.a + ", topicId=" + this.b + '}';
    }
}
