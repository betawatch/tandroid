package c8;

import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class pa {
    public final oa a;
    public final Integer b;

    public /* synthetic */ pa(wf.b bVar) {
        this.a = (oa) bVar.b;
        this.b = (Integer) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        return q6.m.k(this.a, paVar.a) && q6.m.k(this.b, paVar.b) && q6.m.k(null, null) && q6.m.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
