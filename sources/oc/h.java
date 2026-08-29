package oc;

import java.util.regex.Pattern;
import le.p;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h {
    public j a;
    public p b;
    public String c;
    public int d;

    public final String a(Pattern pattern) {
        j jVar = this.a;
        jVar.g = this.d;
        String c3 = jVar.c(pattern);
        this.d = this.a.g;
        return c3;
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
