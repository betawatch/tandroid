package i2;

import android.text.TextUtils;
import v7.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final b2.x b;
    public final b2.x c;
    public final int d;
    public final int e;

    public e(String str, b2.x xVar, b2.x xVar2, int i10, int i11) {
        t6.f(i10 == 0 || i11 == 0);
        t6.f(true ^ TextUtils.isEmpty(str));
        this.a = str;
        xVar.getClass();
        this.b = xVar;
        xVar2.getClass();
        this.c = xVar2;
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
        return this.c.hashCode() + ((this.b.hashCode() + a1.g.f((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
