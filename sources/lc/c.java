package lc;

import java.util.regex.Pattern;
import ne.p;
import qc.h;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // qc.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        d dVar = new d();
        dVar.g = e2.c.j(a2, 2, 2);
        return dVar;
    }

    @Override // qc.h
    public final char d() {
        return '$';
    }
}
