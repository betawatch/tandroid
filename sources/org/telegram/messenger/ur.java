package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class ur {
    public long a;
    public long b;

    public static ur a(long j3, long j10) {
        ur urVar = new ur();
        urVar.a = j3;
        urVar.b = j10;
        return urVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ur.class == obj.getClass()) {
            ur urVar = (ur) obj;
            if (this.a == urVar.a && this.b == urVar.b) {
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
