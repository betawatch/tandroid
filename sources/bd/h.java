package bd;

import gf.p;
import gf.s;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h {
    public j a;
    public p b;
    public String c;
    public int d;

    public final String a(Pattern pattern) {
        j jVar = this.a;
        jVar.g = this.d;
        String c2 = jVar.c(pattern);
        this.d = this.a.g;
        return c2;
    }

    public abstract p b();

    public final char c() {
        j jVar = this.a;
        jVar.g = this.d;
        return jVar.d();
    }

    public abstract char d();

    public final void e() {
        j jVar = this.a;
        jVar.g = this.d;
        jVar.c(j.k);
        this.d = this.a.g;
    }

    public final s f(String str) {
        this.a.getClass();
        return new s(str);
    }
}
