package lc;

import java.util.regex.Pattern;
import ne.p;
import qc.h;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
