// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hya {
    public final int a;
    public final long b;
    public final Uri c;
    public final mm5 d;
    public final mm5 e;

    public hya(int i, long j, Uri uri, w59 w59Var, w59 w59Var2) {
        this.a = i;
        this.b = j;
        this.c = uri;
        this.d = mm5.q(w59Var);
        this.e = mm5.q(w59Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hya)) {
            return false;
        }
        hya hyaVar = (hya) obj;
        return this.a == hyaVar.a && this.b == hyaVar.b && Objects.equals(this.c, hyaVar.c) && Objects.equals(this.d, hyaVar.d) && Objects.equals(this.e, hyaVar.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e);
    }
}
