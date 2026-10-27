package i2;

import a8.yb;
import android.text.TextUtils;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final b2.x b;
    public final b2.x c;
    public final int d;
    public final int e;

    public f(String str, b2.x xVar, b2.x xVar2, int i10, int i11) {
        yb.g(i10 == 0 || i11 == 0);
        yb.g(true ^ TextUtils.isEmpty(str));
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
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.a.equals(fVar.a) && this.b.equals(fVar.b) && this.c.equals(fVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + a1.g.f((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
