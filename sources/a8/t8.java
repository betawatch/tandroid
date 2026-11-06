package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
