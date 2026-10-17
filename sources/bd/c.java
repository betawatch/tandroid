package bd;

import com.google.android.gms.internal.cast.a6;
import df.p;
import gd.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // gd.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        d dVar = new d();
        dVar.g = a6.j(2, 2, a2);
        return dVar;
    }

    @Override // gd.h
    public final char d() {
        return '$';
    }
}
