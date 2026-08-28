package mc;

import ie.p;
import ie.s;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h {
    public i a;
    public p b;
    public String c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.a;
        iVar.g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.a.g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.a;
        iVar.g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.a;
        iVar.g = this.d;
        iVar.c(i.k);
        this.d = this.a.g;
    }

    public final s f(String str) {
        this.a.getClass();
        return new s(str);
    }
}
