package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b extends h {
    public static final Pattern e = i.m;

    @Override // ed.h
    public final p b() {
        this.d++;
        if (c() == '\n') {
            kf.g gVar = new kf.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.c.length()) {
            String str = this.c;
            int i7 = this.d;
            if (e.matcher(str.substring(i7, i7 + 1)).matches()) {
                String str2 = this.c;
                int i10 = this.d;
                this.a.getClass();
                s sVar = new s(str2.substring(i10, i10 + 1));
                this.d++;
                return sVar;
            }
        }
        return f("\\");
    }

    @Override // ed.h
    public final char d() {
        return '\\';
    }
}
