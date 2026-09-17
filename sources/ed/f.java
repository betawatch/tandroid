package ed;

import bf.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // ed.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(af.b.a(a2));
        }
        return null;
    }

    @Override // ed.h
    public final char d() {
        return '&';
    }
}
