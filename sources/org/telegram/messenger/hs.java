package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class hs {
    public long a;
    public long b;

    public static hs a(long j10, long j11) {
        hs hsVar = new hs();
        hsVar.a = j10;
        hsVar.b = j11;
        return hsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hs.class == obj.getClass()) {
            hs hsVar = (hs) obj;
            if (this.a == hsVar.a && this.b == hsVar.b) {
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
