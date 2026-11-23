package jb;

import c8.qb;
import java.io.FileInputStream;
import m1.g1;
import m1.y0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class j implements y0 {
    public static final j a = new j();
    public static final i b = new i(null, null, null, null, null);

    @Override // m1.y0
    public final /* bridge */ /* synthetic */ Object a() {
        return b;
    }

    @Override // m1.y0
    public final Object b(FileInputStream fileInputStream) {
        try {
            pe.b bVar = pe.b.d;
            String str = new String(qb.b(fileInputStream), xd.a.a);
            bVar.getClass();
            return (i) bVar.a(i.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new m1.b("Cannot parse session configs", e10);
        }
    }

    @Override // m1.y0
    public final void c(Object obj, g1 g1Var) {
        byte[] bytes = pe.b.d.b(i.Companion.serializer(), (i) obj).getBytes(xd.a.a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        g1Var.write(bytes);
    }
}
