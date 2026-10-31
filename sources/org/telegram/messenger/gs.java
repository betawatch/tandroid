package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class gs {
    public long a;
    public long b;

    public static gs a(long j10, long j11) {
        gs gsVar = new gs();
        gsVar.a = j10;
        gsVar.b = j11;
        return gsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gs.class == obj.getClass()) {
            gs gsVar = (gs) obj;
            if (this.a == gsVar.a && this.b == gsVar.b) {
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
