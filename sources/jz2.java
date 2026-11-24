// default package

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jz2 {
    public final i73 a;
    public final mx6 b;

    public jz2(i73 i73Var, jd4 jd4Var) {
        this.a = i73Var;
        this.b = new mx6(jd4Var);
    }

    public final String a(String str) {
        String substring;
        mx6 mx6Var = this.b;
        synchronized (mx6Var) {
            if (Objects.equals((String) mx6Var.c, str)) {
                return (String) mx6Var.d;
            }
            jd4 jd4Var = (jd4) mx6Var.b;
            iz2 iz2Var = mx6.n;
            File file = new File((File) jd4Var.d, str);
            file.mkdirs();
            List e = jd4.e(file.listFiles(iz2Var));
            if (e.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e, mx6.r)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        mx6 mx6Var = this.b;
        synchronized (mx6Var) {
            if (!Objects.equals((String) mx6Var.c, str)) {
                mx6.d0((jd4) mx6Var.b, str, (String) mx6Var.d);
                mx6Var.c = str;
            }
        }
    }
}
