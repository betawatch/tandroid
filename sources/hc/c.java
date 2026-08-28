package hc;

import ie.p;
import java.util.regex.Pattern;
import mc.h;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // mc.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        d dVar = new d();
        dVar.g = e2.c.m(a2, 2, 2);
        return dVar;
    }

    @Override // mc.h
    public final char d() {
        return '$';
    }
}
