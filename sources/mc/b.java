package mc;

import ie.p;
import ie.s;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends h {
    public static final Pattern e = i.m;

    @Override // mc.h
    public final p b() {
        this.d++;
        if (c() == '\n') {
            ie.g gVar = new ie.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.c.length()) {
            String str = this.c;
            int i9 = this.d;
            if (e.matcher(str.substring(i9, i9 + 1)).matches()) {
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

    @Override // mc.h
    public final char d() {
        return '\\';
    }
}
