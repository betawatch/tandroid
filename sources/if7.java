// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class if7 {
    public long a;
    public long b;

    public static if7 a(long j, long j2) {
        if7 if7Var = new if7();
        if7Var.a = j;
        if7Var.b = j2;
        return if7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && if7.class == obj.getClass()) {
            if7 if7Var = (if7) obj;
            if (this.a == if7Var.a && this.b == if7Var.b) {
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
