package jb;

import c8.qb;
import java.io.FileInputStream;
import m1.g1;
import m1.y0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
