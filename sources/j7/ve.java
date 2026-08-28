package j7;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ve {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ve(b3.b bVar) {
        this.a = (Boolean) bVar.a;
        this.b = (Boolean) bVar.b;
        this.c = (Boolean) bVar.c;
        this.d = (Boolean) bVar.d;
        this.e = (Boolean) bVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return x5.l.l(this.a, veVar.a) && x5.l.l(this.b, veVar.b) && x5.l.l(this.c, veVar.c) && x5.l.l(this.d, veVar.d) && x5.l.l(this.e, veVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
