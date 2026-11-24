// default package

import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bm5 extends kp {
    public final v59 C() {
        if (this.b == 0) {
            return v59.r;
        }
        return new v59(this.b, (Object[]) this.c);
    }

    public final void D(sxb sxbVar, String str) {
        super.w(sxbVar, str);
    }

    public final void E(Set set) {
        super.x(set);
    }

    @Override // kp
    public final qm5 e() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    @Override // kp
    public final kp w(Object obj, Object obj2) {
        super.w(obj, obj2);
        return this;
    }

    @Override // kp
    public final kp x(Set set) {
        super.x(set);
        return this;
    }
}
