package ed;

import bf.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class g extends h {
    public static final Pattern e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override // ed.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        bf.d dVar = new bf.d(1);
        dVar.h = a2;
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '<';
    }
}
