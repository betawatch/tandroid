// default package

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i3c {
    public static volatile o63 e;
    public final hk2 a;
    public final hk2 b;
    public final kd3 c;
    public final za0 d;

    public i3c(hk2 hk2Var, hk2 hk2Var2, kd3 kd3Var, za0 za0Var, e7a e7aVar) {
        this.a = hk2Var;
        this.b = hk2Var2;
        this.c = kd3Var;
        this.d = za0Var;
        ((Executor) e7aVar.a).execute(new cpc(e7aVar, (byte) 18));
    }

    public static i3c a() {
        o63 o63Var = e;
        if (o63Var != null) {
            return (i3c) o63Var.f.get();
        }
        dq9.m("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (i3c.class) {
                if (e == null) {
                    n63 n63Var = new n63();
                    context.getClass();
                    n63Var.a = context;
                    e = n63Var.a();
                }
            }
        }
    }

    public final g3c c(p61 p61Var) {
        byte[] bytes;
        Set unmodifiableSet = wi8.A(p61Var) ? DesugarCollections.unmodifiableSet(p61.d) : Collections.singleton(new d44("proto"));
        mx6 a = rb0.a();
        p61Var.getClass();
        a.b = "cct";
        String str = p61Var.a;
        String str2 = p61Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = td4.r("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a.c = bytes;
        return new g3c(unmodifiableSet, a.u(), this);
    }
}
