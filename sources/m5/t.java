package m5;

import aa.b0;
import android.content.Context;
import c3.h0;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.h1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t {
    public static volatile k e;
    public final v5.a a;
    public final v5.a b;
    public final r5.b c;
    public final b0 d;

    public t(v5.a aVar, v5.a aVar2, r5.b bVar, b0 b0Var, com.google.firebase.messaging.q qVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = b0Var;
        ((Executor) qVar.a).execute(new h1(qVar, 15));
    }

    public static t a() {
        k kVar = e;
        if (kVar != null) {
            return (t) kVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (t.class) {
                try {
                    if (e == null) {
                        j jVar = new j();
                        context.getClass();
                        jVar.a = context;
                        e = jVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final r c(l lVar) {
        byte[] bytes;
        Set unmodifiableSet = lVar != null ? DesugarCollections.unmodifiableSet(k5.a.d) : Collections.singleton(new j5.c("proto"));
        k6.c a2 = i.a();
        lVar.getClass();
        a2.c = "cct";
        k5.a aVar = (k5.a) lVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = h0.m("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.b = bytes;
        return new r(unmodifiableSet, a2.j(), this);
    }
}
