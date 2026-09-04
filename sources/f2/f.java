package f2;

import b2.m0;
import b2.o0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f implements o0 {
    public final float a;
    public final float b;

    public f(float f7, float f10) {
        e2.d.a("Invalid latitude or longitude", f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f);
        this.a = f7;
        this.b = f10;
    }

    @Override // b2.o0
    public final /* synthetic */ b2.s a() {
        return null;
    }

    @Override // b2.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.a == fVar.a && this.b == fVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    @Override // b2.o0
    public final /* synthetic */ void b(m0 m0Var) {
    }
}
