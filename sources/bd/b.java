package bd;

import gf.p;
import gf.s;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends h {
    public static final Pattern e = j.m;

    @Override // bd.h
    public final p b() {
        this.d++;
        if (c() == '\n') {
            gf.g gVar = new gf.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.c.length()) {
            String str = this.c;
            int i3 = this.d;
            if (e.matcher(str.substring(i3, i3 + 1)).matches()) {
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

    @Override // bd.h
    public final char d() {
        return '\\';
    }
}
