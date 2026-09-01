package lc;

import java.util.regex.Pattern;
import ne.p;
import qc.h;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
