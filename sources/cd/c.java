package cd;

import c3.h0;
import ef.p;
import hd.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // hd.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        d dVar = new d();
        dVar.g = h0.l(2, 2, a2);
        return dVar;
    }

    @Override // hd.h
    public final char d() {
        return '$';
    }
}
