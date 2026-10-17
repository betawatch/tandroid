package i2;

import android.text.TextUtils;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final b2.w b;
    public final b2.w c;
    public final int d;
    public final int e;

    public e(String str, b2.w wVar, b2.w wVar2, int i10, int i11) {
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
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.e == eVar.e && this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
