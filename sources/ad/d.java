package ad;

import cf.p;
import com.google.android.gms.internal.vision.e2;
import fd.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // fd.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        e eVar = new e();
        eVar.g = e2.i(2, 2, a2);
        return eVar;
    }

    @Override // fd.h
    public final char d() {
        return '$';
    }
}
