package ai;

import j$.util.Objects;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class w extends og.a {
    public final long c;

    public w(long j3) {
        super(0, false);
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.c == ((w) obj).c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.c));
    }
}
