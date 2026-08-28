package mc;

import ie.p;
import ie.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // mc.h
    public final p b() {
        this.d++;
        p pVar = (p) this.b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.g.endsWith(" ")) {
                String str = sVar.g;
                Matcher matcher = e.matcher(str);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    sVar.g = e2.c.m(str, end, 0);
                }
                return end >= 2 ? new ie.g(1) : new ie.g(2);
            }
        }
        return new ie.g(2);
    }

    @Override // mc.h
    public final char d() {
        return '\n';
    }
}
