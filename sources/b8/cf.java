package b8;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class cf {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ cf(ke keVar) {
        this.a = (Boolean) keVar.b;
        this.b = (Boolean) keVar.c;
        this.c = (Boolean) keVar.d;
        this.d = (Boolean) keVar.e;
        this.e = (Boolean) keVar.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return p6.m.k(this.a, cfVar.a) && p6.m.k(this.b, cfVar.b) && p6.m.k(this.c, cfVar.c) && p6.m.k(this.d, cfVar.d) && p6.m.k(this.e, cfVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
