package i7;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m8 {
    public final Float a;

    public /* synthetic */ m8(ga.c cVar) {
        this.a = (Float) cVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m8) {
            return y5.l.l(null, null) && y5.l.l(this.a, ((m8) obj).a) && y5.l.l(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
