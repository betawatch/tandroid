package gb;

import c8.nb;
import java.io.FileInputStream;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k0 implements m1.y0 {
    public final u0 a;

    public k0(u0 sessionGenerator) {
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        this.a = sessionGenerator;
    }

    @Override // m1.y0
    public final Object a() {
        return new j0(this.a.a(null), null, null);
    }

    @Override // m1.y0
    public final Object b(FileInputStream fileInputStream) {
        try {
            pe.b bVar = pe.b.d;
            String str = new String(nb.b(fileInputStream), xd.a.a);
            bVar.getClass();
            return (j0) bVar.a(j0.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new m1.b("Cannot parse session data", e10);
        }
    }

    @Override // m1.y0
    public final void c(Object obj, m1.g1 g1Var) {
        byte[] bytes = pe.b.d.b(j0.Companion.serializer(), (j0) obj).getBytes(xd.a.a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        g1Var.write(bytes);
    }
}
