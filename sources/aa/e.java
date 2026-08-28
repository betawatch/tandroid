package aa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import y9.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j a;
    public long b;
    public int c;

    public e() {
        if (ya.b.b == null) {
            Pattern pattern = j.c;
            ya.b.b = new ya.b(3);
        }
        ya.b bVar = ya.b.b;
        if (j.d == null) {
            j.d = new j(bVar);
        }
        this.a = j.d;
    }

    public final synchronized long a(int i9) {
        if (!(i9 == 429 || (i9 >= 500 && i9 < 600))) {
            return d;
        }
        double pow = Math.pow(2.0d, this.c);
        this.a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.c != 0) {
            this.a.a.getClass();
            z10 = System.currentTimeMillis() > this.b;
        }
        return z10;
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i9) {
        if ((i9 >= 200 && i9 < 300) || i9 == 401 || i9 == 404) {
            c();
            return;
        }
        this.c++;
        long a2 = a(i9);
        this.a.a.getClass();
        this.b = System.currentTimeMillis() + a2;
    }
}
