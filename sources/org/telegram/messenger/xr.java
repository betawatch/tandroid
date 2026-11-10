package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class xr {
    public long a;
    public long b;

    public static xr a(long j3, long j10) {
        xr xrVar = new xr();
        xrVar.a = j3;
        xrVar.b = j10;
        return xrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xr.class == obj.getClass()) {
            xr xrVar = (xr) obj;
            if (this.a == xrVar.a && this.b == xrVar.b) {
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
