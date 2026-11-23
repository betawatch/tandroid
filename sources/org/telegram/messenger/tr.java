package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class tr {
    public long a;
    public long b;

    public static tr a(long j3, long j10) {
        tr trVar = new tr();
        trVar.a = j3;
        trVar.b = j10;
        return trVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tr.class == obj.getClass()) {
            tr trVar = (tr) obj;
            if (this.a == trVar.a && this.b == trVar.b) {
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
