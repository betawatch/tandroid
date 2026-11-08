package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t8 {
    public final Float a;

    public /* synthetic */ t8(d6.i iVar) {
        this.a = (Float) iVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t8) {
            return q6.m.k(null, null) && q6.m.k(this.a, ((t8) obj).a) && q6.m.k(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
