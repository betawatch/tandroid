package i5;

import g9.l;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        l lVar = new l(7, (byte) 0);
        lVar.b = Boolean.FALSE;
        c = new b(lVar);
    }

    public b(l lVar) {
        this.a = ((Boolean) lVar.b).booleanValue();
        this.b = (String) lVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return z5.l.l(null, null) && this.a == bVar.a && z5.l.l(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
