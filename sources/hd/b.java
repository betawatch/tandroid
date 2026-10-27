package hd;

import ef.p;
import ef.s;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends h {
    public static final Pattern e = i.m;

    @Override // hd.h
    public final p b() {
        this.d++;
        if (c() == '\n') {
            ef.g gVar = new ef.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.c.length()) {
            String str = this.c;
            int i10 = this.d;
            if (e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.c;
                int i11 = this.d;
                this.a.getClass();
                s sVar = new s(str2.substring(i11, i11 + 1));
                this.d++;
                return sVar;
            }
        }
        return f("\\");
    }

    @Override // hd.h
    public final char d() {
        return '\\';
    }
}
