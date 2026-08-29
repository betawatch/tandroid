package l7;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ve {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ve(a5.j jVar) {
        this.a = (Boolean) jVar.a;
        this.b = (Boolean) jVar.b;
        this.c = (Boolean) jVar.c;
        this.d = (Boolean) jVar.d;
        this.e = (Boolean) jVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return z5.l.l(this.a, veVar.a) && z5.l.l(this.b, veVar.b) && z5.l.l(this.c, veVar.c) && z5.l.l(this.d, veVar.d) && z5.l.l(this.e, veVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
