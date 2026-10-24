package bd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import gd.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        dVar.g = k3.i(2, 2, a2);
        return dVar;
    }

    @Override // gd.h
    public final char d() {
        return '$';
    }
}
