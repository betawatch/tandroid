// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bfb {
    public static final bfb e = new bfb(false, new yeb(TLObject.FLAG_31, -2147483647), efb.T, 0.0f);
    public final boolean a;
    public final yeb b;
    public final qeb c;
    public final float d;

    public bfb(boolean z, yeb yebVar, qeb qebVar, float f) {
        this.a = z;
        this.b = yebVar;
        this.c = qebVar;
        this.d = f;
    }

    public final qeb a(boolean z) {
        qeb qebVar = efb.T;
        qeb qebVar2 = this.c;
        return qebVar2 != qebVar ? qebVar2 : this.d == 0.0f ? z ? efb.U : efb.V : efb.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bfb.class != obj.getClass()) {
            return false;
        }
        bfb bfbVar = (bfb) obj;
        return this.c.equals(bfbVar.c) && this.b.equals(bfbVar.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
