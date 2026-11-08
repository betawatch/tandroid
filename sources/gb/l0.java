package gb;

import c8.lb;
import java.io.FileInputStream;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l0 implements m1.y0 {
    public final v0 a;

    public l0(v0 sessionGenerator) {
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        this.a = sessionGenerator;
    }

    @Override // m1.y0
    public final Object a() {
        return new k0(this.a.a(null), null, null);
    }

    @Override // m1.y0
    public final Object b(FileInputStream fileInputStream) {
        try {
            pe.b bVar = pe.b.d;
            String str = new String(lb.b(fileInputStream), xd.a.a);
            bVar.getClass();
            return (k0) bVar.a(k0.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new m1.b("Cannot parse session data", e10);
        }
    }

    @Override // m1.y0
    public final void c(Object obj, m1.g1 g1Var) {
        byte[] bytes = pe.b.d.b(k0.Companion.serializer(), (k0) obj).getBytes(xd.a.a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        g1Var.write(bytes);
    }
}
