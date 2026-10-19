package l5;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class h {
    public final String a;
    public final Integer b;
    public final m c;
    public final long d;
    public final long e;
    public final Map f;

    public h(String str, Integer num, m mVar, long j10, long j11, HashMap hashMap) {
        this.a = str;
        this.b = num;
        this.c = mVar;
        this.d = j10;
        this.e = j11;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.l c() {
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        lVar.a = str;
        lVar.b = this.b;
        m mVar = this.c;
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        lVar.c = mVar;
        lVar.d = Long.valueOf(this.d);
        lVar.e = Long.valueOf(this.e);
        lVar.f = new HashMap(this.f);
        return lVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.b;
            if (this.a.equals(hVar.a) && ((num = this.b) != null ? num.equals(num2) : num2 == null) && this.c.equals(hVar.c) && this.d == hVar.d && this.e == hVar.e && this.f.equals(hVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j10 = this.d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
