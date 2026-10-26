package hd;

import c3.h0;
import ef.p;
import ef.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // hd.h
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
                    sVar.g = h0.l(end, 0, str);
                }
                return end >= 2 ? new ef.g(1) : new ef.g(2);
            }
        }
        return new ef.g(2);
    }

    @Override // hd.h
    public final char d() {
        return '\n';
    }
}
