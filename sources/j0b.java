// default package

import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j0b {
    public final String a;
    public final qo5 b;
    public final qo5 c;
    public final qo5 d;

    public j0b(String str, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = str;
        this.b = qo5.b(hashMap);
        this.c = qo5.b(hashMap2);
        this.d = qo5.b(hashMap3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0b)) {
            return false;
        }
        j0b j0bVar = (j0b) obj;
        return Objects.equals(this.a, j0bVar.a) && this.b.equals(j0bVar.b) && this.c.equals(j0bVar.c) && this.d.equals(j0bVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
