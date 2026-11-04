package b8;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ya {
    public final xa a;
    public final Integer b;

    public /* synthetic */ ya(tf.b bVar) {
        this.a = (xa) bVar.a;
        this.b = (Integer) bVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj;
        return p6.m.k(this.a, yaVar.a) && p6.m.k(this.b, yaVar.b) && p6.m.k(null, null) && p6.m.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
