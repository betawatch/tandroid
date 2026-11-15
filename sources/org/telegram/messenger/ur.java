package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
