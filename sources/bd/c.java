package bd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import gd.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
