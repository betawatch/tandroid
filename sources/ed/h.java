package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
