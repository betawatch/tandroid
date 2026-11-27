// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jf7 {
    public long a;
    public long b;

    public static jf7 a(long j, long j2) {
        jf7 jf7Var = new jf7();
        jf7Var.a = j;
        jf7Var.b = j2;
        return jf7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jf7.class == obj.getClass()) {
            jf7 jf7Var = (jf7) obj;
            if (this.a == jf7Var.a && this.b == jf7Var.b) {
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
