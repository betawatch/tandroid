package j7;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ra {
    public final qa a;
    public final Integer b;

    public /* synthetic */ ra(g5.b bVar) {
        this.a = (qa) bVar.b;
        this.b = (Integer) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return x5.l.l(this.a, raVar.a) && x5.l.l(this.b, raVar.b) && x5.l.l(null, null) && x5.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
