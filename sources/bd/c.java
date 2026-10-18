package bd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import gd.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        dVar.g = k3.j(2, 2, a2);
        return dVar;
    }

    @Override // gd.h
    public final char d() {
        return '$';
    }
}
