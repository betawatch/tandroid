// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class j2b {
    public final int a;
    public final long b;
    public final Uri c;
    public final po5 d;
    public final po5 e;

    public j2b(int i, long j, Uri uri, j99 j99Var, j99 j99Var2) {
        this.a = i;
        this.b = j;
        this.c = uri;
        this.d = po5.q(j99Var);
        this.e = po5.q(j99Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2b)) {
            return false;
        }
        j2b j2bVar = (j2b) obj;
        return this.a == j2bVar.a && this.b == j2bVar.b && Objects.equals(this.c, j2bVar.c) && Objects.equals(this.d, j2bVar.d) && Objects.equals(this.e, j2bVar.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e);
    }
}
