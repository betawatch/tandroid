package mc;

import ie.p;
import ie.s;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // mc.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String m10 = e2.c.m(a2, 1, 1);
            ie.k kVar = new ie.k(1, ta.b.d("mailto:", m10), null);
            kVar.b(new s(m10));
            return kVar;
        }
        String a3 = a(f);
        if (a3 == null) {
            return null;
        }
        String m11 = e2.c.m(a3, 1, 1);
        ie.k kVar2 = new ie.k(1, m11, null);
        kVar2.b(new s(m11));
        return kVar2;
    }

    @Override // mc.h
    public final char d() {
        return '<';
    }
}
