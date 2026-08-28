package g5;

import java.util.Arrays;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements com.google.android.gms.common.api.b {
    public static final c c;
    public final boolean a;
    public final String b;

    static {
        b bVar = new b(0);
        bVar.b = Boolean.FALSE;
        c = new c(bVar);
    }

    public c(b bVar) {
        this.a = ((Boolean) bVar.b).booleanValue();
        this.b = (String) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.l(null, null) && this.a == cVar.a && l.l(this.b, cVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
