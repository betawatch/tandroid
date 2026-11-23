package o5;

import ab.c0;
import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class t {
    public static volatile k e;
    public final x5.a a;
    public final x5.a b;
    public final t5.b c;
    public final ia.c d;

    public t(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, c0 c0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = cVar;
        ((Executor) c0Var.b).execute(new z0(c0Var, 24));
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
        Set unmodifiableSet = lVar != null ? DesugarCollections.unmodifiableSet(m5.a.d) : Collections.singleton(new l5.c("proto"));
        h6.m a10 = i.a();
        lVar.getClass();
        a10.b = "cct";
        m5.a aVar = (m5.a) lVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.c = bytes;
        return new r(unmodifiableSet, a10.u(), this);
    }
}
