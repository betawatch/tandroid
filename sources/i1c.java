// default package

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i1c {
    public static volatile c53 e;
    public final ti2 a;
    public final ti2 b;
    public final yb3 c;
    public final z90 d;

    public i1c(ti2 ti2Var, ti2 ti2Var2, yb3 yb3Var, z90 z90Var, wtc wtcVar) {
        this.a = ti2Var;
        this.b = ti2Var2;
        this.c = yb3Var;
        this.d = z90Var;
        ((Executor) wtcVar.a).execute(new frc(wtcVar, (byte) 11));
    }

    public static i1c a() {
        c53 c53Var = e;
        if (c53Var != null) {
            return (i1c) c53Var.f.get();
        }
        sc8.j("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (i1c.class) {
                if (e == null) {
                    dj0 dj0Var = new dj0();
                    context.getClass();
                    dj0Var.a = context;
                    e = dj0Var.a();
                }
            }
        }
    }

    public final g1c c(i51 i51Var) {
        byte[] bytes;
        Set unmodifiableSet = ug8.A(i51Var) ? DesugarCollections.unmodifiableSet(i51.d) : Collections.singleton(new s24("proto"));
        mv6 a = ra0.a();
        i51Var.getClass();
        a.b = "cct";
        String str = i51Var.a;
        String str2 = i51Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = tb4.q("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a.c = bytes;
        return new g1c(unmodifiableSet, a.o(), this);
    }
}
