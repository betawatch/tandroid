package gd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import df.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // gd.h
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
                    sVar.g = k3.i(end, 0, str);
                }
                return end >= 2 ? new df.g(1) : new df.g(2);
            }
        }
        return new df.g(2);
    }

    @Override // gd.h
    public final char d() {
        return '\n';
    }
}
