// default package

import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class i2b {
    public final String a;
    public final to5 b;
    public final to5 c;
    public final to5 d;

    public i2b(String str, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = str;
        this.b = to5.b(hashMap);
        this.c = to5.b(hashMap2);
        this.d = to5.b(hashMap3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2b)) {
            return false;
        }
        i2b i2bVar = (i2b) obj;
        return Objects.equals(this.a, i2bVar.a) && this.b.equals(i2bVar.b) && this.c.equals(i2bVar.c) && this.d.equals(i2bVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
