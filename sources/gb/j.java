package gb;

import b8.ge;
import java.io.FileInputStream;
import l1.h1;
import l1.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements z0 {
    public static final j a = new j();
    public static final i b = new i(null, null, null, null, null);

    @Override // l1.z0
    public final /* bridge */ /* synthetic */ Object a() {
        return b;
    }

    @Override // l1.z0
    public final void b(Object obj, h1 h1Var) {
        byte[] bytes = me.b.d.b(i.Companion.serializer(), (i) obj).getBytes(ud.a.a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        h1Var.write(bytes);
    }

    @Override // l1.z0
    public final Object c(FileInputStream fileInputStream) {
        try {
            me.b bVar = me.b.d;
            String str = new String(ge.b(fileInputStream), ud.a.a);
            bVar.getClass();
            return (i) bVar.a(i.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new l1.b("Cannot parse session configs", e10);
        }
    }
}
