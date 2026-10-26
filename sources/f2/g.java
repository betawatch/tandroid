package f2;

import a8.yb;
import b2.r0;
import b2.t0;
import b2.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g implements t0 {
    public final float a;
    public final float b;

    public g(float f7, float f10) {
        yb.f("Invalid latitude or longitude", f7 >= -90.0f && f7 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f);
        this.a = f7;
        this.b = f10;
    }

    @Override // b2.t0
    public final /* synthetic */ x a() {
        return null;
    }

    @Override // b2.t0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.a == gVar.a && this.b == gVar.b) {
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

    @Override // b2.t0
    public final /* synthetic */ void b(r0 r0Var) {
    }
}
