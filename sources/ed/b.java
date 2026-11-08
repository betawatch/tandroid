package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
