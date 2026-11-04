package bd;

import gf.p;
import gf.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // bd.h
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
                    sVar.g = com.google.android.recaptcha.internal.a.j(str, end, 0);
                }
                return end >= 2 ? new gf.g(1) : new gf.g(2);
            }
        }
        return new gf.g(2);
    }

    @Override // bd.h
    public final char d() {
        return '\n';
    }
}
