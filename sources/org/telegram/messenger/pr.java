package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class pr {
    public long a;
    public long b;

    public static pr a(long j10, long j11) {
        pr prVar = new pr();
        prVar.a = j10;
        prVar.b = j11;
        return prVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pr.class == obj.getClass()) {
            pr prVar = (pr) obj;
            if (this.a == prVar.a && this.b == prVar.b) {
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
