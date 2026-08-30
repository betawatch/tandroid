package k5;

import b6.m;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        f7.b bVar = new f7.b((char) 0, 20);
        bVar.b = Boolean.FALSE;
        c = new b(bVar);
    }

    public b(f7.b bVar) {
        this.a = ((Boolean) bVar.b).booleanValue();
        this.b = (String) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.l(null, null) && this.a == bVar.a && m.l(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
