// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
