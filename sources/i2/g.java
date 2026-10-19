package i2;

import android.text.TextUtils;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final b2.w b;
    public final b2.w c;
    public final int d;
    public final int e;

    public g(String str, b2.w wVar, b2.w wVar2, int i10, int i11) {
        u6.g(i10 == 0 || i11 == 0);
        u6.g(true ^ TextUtils.isEmpty(str));
        this.a = str;
        wVar.getClass();
        this.b = wVar;
        wVar2.getClass();
        this.c = wVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.d == gVar.d && this.e == gVar.e && this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c.equals(gVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
