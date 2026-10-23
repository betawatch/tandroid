package i2;

import android.text.TextUtils;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final b2.w b;
    public final b2.w c;
    public final int d;
    public final int e;

    public f(String str, b2.w wVar, b2.w wVar2, int i10, int i11) {
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
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.a.equals(fVar.a) && this.b.equals(fVar.b) && this.c.equals(fVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
