package n5;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s {
    public static volatile j e;
    public final w5.a a;
    public final w5.a b;
    public final s5.b c;
    public final ha.c d;

    public s(w5.a aVar, w5.a aVar2, s5.b bVar, ha.c cVar, za.p pVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = cVar;
        ((Executor) pVar.a).execute(new u(pVar, 4));
    }

    public static s a() {
        j jVar = e;
        if (jVar != null) {
            return (s) jVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (s.class) {
                try {
                    if (e == null) {
                        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n();
                        context.getClass();
                        nVar.a = context;
                        e = nVar.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final q c(k kVar) {
        byte[] bytes;
        Set unmodifiableSet = kVar != null ? DesugarCollections.unmodifiableSet(l5.a.d) : Collections.singleton(new k5.c("proto"));
        k4.j a10 = i.a();
        kVar.getClass();
        a10.a = "cct";
        l5.a aVar = (l5.a) kVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = com.google.android.recaptcha.internal.a.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.b = bytes;
        return new q(unmodifiableSet, a10.l(), this);
    }
}
