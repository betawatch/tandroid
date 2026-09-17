package ed;

import bf.p;
import bf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // ed.h
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
                    sVar.g = e2.i(end, 0, str);
                }
                return end >= 2 ? new bf.g(1) : new bf.g(2);
            }
        }
        return new bf.g(2);
    }

    @Override // ed.h
    public final char d() {
        return '\n';
    }
}
